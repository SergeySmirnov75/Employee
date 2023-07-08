package proSkyEmployee.exeptions;

public class EmployeeStorageIsFullException extends EmployeeException
{
    public EmployeeStorageIsFullException (String message)
    {
        super(message);
    }

}
