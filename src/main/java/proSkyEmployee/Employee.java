package proSkyEmployee;
import java.lang.reflect.Array;
import java.util.Objects;

public class Employee
{
    private int size;
    private String firstName;
    private String lastName;
    private static int idCreator;
    private int id;

    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName  = lastName;

        this.id = idCreator++;
    }


    public String getFirstNameName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(lastName, id);
    }

    @Override
    public String toString()
    {
        return "Имя : " + lastName +
                "\nID: " + getId();
    }
}