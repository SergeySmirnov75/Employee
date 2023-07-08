package proSkyEmployee;

public class ArrEmployee
{
    private final Employee[] persons;
    private int size;

    public ArrEmployee() {
        this.persons = new Employee[10];
        // Задали массиву Contact длину — 10
    }


    // Реализуем метод add (создать сотрудника):

    public void addEmployer(String firstName, String lastName) {

        if (size >= persons.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newContact = new Employee(firstName, lastName);
        persons[size++] = newContact;
    }


    // Реализуем метод printAllEmployer (распечатать всех сотрудников)
    public void printAllEmployer() {
        for (int i = 0; i < size; i++) {
            Employee newPerson = persons[i];
            System.out.println(newPerson.toString());
        }
    }

    public void printFullName() {
        for (int i = 0; i < size; i++) {
            Employee fullName = persons[i];
            System.out.println(fullName.getFirstNameName());
        }
    }

}
