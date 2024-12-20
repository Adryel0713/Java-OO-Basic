package exercise02;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = s.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary = s.nextDouble();
		System.out.print("Tax: ");
		double tax = s.nextDouble();
		
		System.out.println();
		
		Employee employee = new Employee(name, grossSalary, tax);
		
		employee.netSalary();
		
		System.out.println("Employee: " + employee);
		
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double increase = s.nextDouble();
		
		System.out.println();
		
		employee.increaseSalary(increase);
		
		System.out.println("Update data: " + employee);
		
		s.close();
	}

}
