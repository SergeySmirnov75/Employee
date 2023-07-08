package proSkyEmployee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService
{
    public String hello()
    {
        return "hello";
    }

    public String answerHello(String userName)
    {
        return "<b>hello</b>" + userName;
    }

    public String answerEmployee()
    {
        return "Добро пожаловать в калькулятор!";
    }

    public String addEmployee(String firstName, String lastName)
    {

        return "add new Employee " + firstName + " " + lastName;
    }

    public String deleteEmployee(String firstName, String lastName)
    {
        return "delete Employee " + firstName + " " + lastName;
    }

    public String findEmployee(String firstName, String lastName)
    {

        return "find Employee " + firstName + " " + lastName;
    }

}
