package proSkyEmployee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class EmployeeController
{
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }


    @GetMapping
    public String hello()
    {
        return "hello";
    }

    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName)
    {
        return "<b>hello</b>" + userName;
    }


    @RequestMapping(path = "/")
    public String answerEmployee()
    {
        return "Добро пожаловать в калькулятор!";
    }


    @RequestMapping(path = "/add")
    public String addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
    {
        return employeeService.addEmployee(firstName, lastName);
    }

    @RequestMapping(path = "/remove")
    public String deleteEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
    {
        return employeeService.deleteEmployee(firstName, lastName);
    }

    @RequestMapping(path = "/find")
    public String findEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
    {
        return employeeService.findEmployee(firstName, lastName);
    }


}
