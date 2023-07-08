package proSkyEmployee;

import org.springframework.stereotype.Service;
import proSkyEmployee.exeptions.EmployeeAlreadyAddedException;
import proSkyEmployee.exeptions.EmployeeNotFoundException;
import proSkyEmployee.exeptions.EmployeeStorageIsFullException;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeService implements IEmployeeService
{

    private final Set<Employee> employees = new HashSet<>();
    private static final int MAX_EMPLOYEES = 100;

    @Override
    public Employee addEmployee(String firstName, String lastName) throws EmployeeAlreadyAddedException, EmployeeStorageIsFullException
    {
        if (employees.size() >= MAX_EMPLOYEES)
        {
            throw new EmployeeStorageIsFullException("Коллекция переполнена");
        }

        Employee employee = new Employee(firstName, lastName);
        if (!employees.add(employee))
        {
            throw new EmployeeAlreadyAddedException("Добавляемый сотрудник уже имеется в коллекции");
        }

        return employee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) throws EmployeeNotFoundException
    {
        Employee employee = findEmployee(firstName, lastName);
        employees.remove(employee);
        return employee;
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException
    {
        for (Employee employee : employees)
        {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName))
            {
                return employee;
            }
        }

        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    public Set<Employee> getAllEmployees()
    {
        return new HashSet<>(employees);
    }
}