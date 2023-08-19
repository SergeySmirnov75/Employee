package proSkyEmployee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import proSkyEmployee.exeptions.EmployeeException;
import proSkyEmployee.exeptions.EmployeeAlreadyAddedException;
import proSkyEmployee.exeptions.EmployeeNotFoundException;
import proSkyEmployee.exeptions.EmployeeStorageIsFullException;

import java.util.Set;
@RestController
@RequestMapping("/Employee")
public class EmployeeController
{

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public Set<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam() String firstName,
                                @RequestParam() String lastName)
    {
        try
        {
            return employeeService.addEmployee(firstName, lastName);
        } catch (EmployeeAlreadyAddedException | EmployeeStorageIsFullException e)
        {
            throw new EmployeeException("Ошибка обработки сотрудника: " + e.getMessage());
        }
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam() String firstName,
                                   @RequestParam() String lastName)
    {
        try
        {
            return employeeService.removeEmployee(firstName, lastName);
        } catch (EmployeeNotFoundException e)
        {
            throw new EmployeeException("Ошибка обработки сотрудника: " + e.getMessage());
        }
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam() String firstName,
                                 @RequestParam() String lastName)
    {
        try
        {
            return employeeService.findEmployee(firstName, lastName);
        } catch (EmployeeNotFoundException e)
        {
            throw new EmployeeException("Ошибка обработки сотрудника: " + e.getMessage());
        }
    }
}
