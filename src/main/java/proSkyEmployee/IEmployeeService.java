package proSkyEmployee;

import proSkyEmployee.exeptions.EmployeeAlreadyAddedException;
import proSkyEmployee.exeptions.EmployeeNotFoundException;
import proSkyEmployee.exeptions.EmployeeStorageIsFullException;

import java.util.Set;
public interface IEmployeeService
{

    Employee addEmployee(String firstName, String lastName) throws EmployeeAlreadyAddedException, EmployeeStorageIsFullException;

    Employee removeEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    Set<Employee> getAllEmployees();
}
