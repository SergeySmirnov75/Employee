package proSkyEmployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication
{

	public static void main(String[] args)
	{
		ArrEmployee arrEmployee = new ArrEmployee();

		arrEmployee.addEmployer("Сергей Николаевич", "Смирнов");
		arrEmployee.addEmployer("Иван Киприянович", "Киселёв");
		arrEmployee.addEmployer("Павел Владимирович", "Ушаков");
		arrEmployee.addEmployer("Александр Юрьевич", "Максимов");
		arrEmployee.addEmployer("Виталий Владимирович", "Калинин");
		arrEmployee.addEmployer("Андрей Олегович", "Заика");
		arrEmployee.addEmployer("Александр Сергеевич", "Завалин");
		arrEmployee.addEmployer("Артём Алексеевич", "Патерюхин");

		SpringApplication.run(EmployeeApplication.class, args);

	}

}
