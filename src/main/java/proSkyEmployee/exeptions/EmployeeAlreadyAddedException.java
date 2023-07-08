package proSkyEmployee.exeptions;

public class EmployeeAlreadyAddedException extends EmployeeException
{
    public EmployeeAlreadyAddedException (String message)
    {
        super(message);
    }
}

