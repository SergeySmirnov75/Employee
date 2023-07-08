package proSkyEmployee;


public interface EmployeeService
{
    String hello();
    String answerHello(String userName);
    String answerEmployee();
    String addEmployee(String firstName, String lastName);
    String deleteEmployee(String firstName, String lastName);
    String findEmployee(String firstName, String lastName);
}
