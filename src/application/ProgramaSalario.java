package application;

import java.util.Locale;
import java.util.Scanner;

import employee.Information;


public class ProgramaSalario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
				
		Information emp=new Information();
		
		System.out.print("Name: ");
			emp.name=sc.nextLine();
		System.out.print("Gross Salary: ");
			emp.grosssalary=sc.nextDouble();
		System.out.print("Tax: ");
			emp.tax=sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Employee: "+emp.netSalary());
		
		System.out.println();
		
		System.out.println("Wich percentage to increase salary? ");
		double percentage=sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Update data: "+emp.netSalary()+percentage);
		
				
		sc.close();
	}

}
