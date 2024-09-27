package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployeeList {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list=new ArrayList<>();
		
		System.out.println("how many employees will be registred? ");
		int N=sc.nextInt();
		
	for(int i=0;i<N;i++) {
		System.out.println();
		System.out.println("Employee #"+(i+1)+":");
		System.out.println("Id: ");
			Integer id=sc.nextInt();
			while (hasId(list,id)) {
				System.out.println("Id already taken! try again: ");
				id=sc.nextInt();
			}
		System.out.println("Name: ");
			sc.nextLine();
			String name=sc.nextLine();
		System.out.println("Salary: ");
			Double salary=sc.nextDouble();	
		
		Employee emp=new Employee(id, name, salary);
		list.add(emp);
	}
	System.out.println("Enter the employee id that will have salary increase : ");
		int idsalary=sc.nextInt();
	
	Employee emp =list.stream().filter(x->x.getId()==idsalary).findFirst().orElse(null);	
	//or
	//Integer pos=position(list, idsalary);
	
	if (emp==null) {
		System.out.println("this id does't exist!");
	}else {
		System.out.println("enter percentage: ");
			double percent=sc.nextDouble();
			emp.increaseSalary(percent);
	}	
	
	System.out.println();
	System.out.println("List of employees: ");
		for(Employee e:list) {
			System.out.println(e);
	}
	
	sc.close();
	}	
	static Integer position(List<Employee> list,int id) {//Integer return null,int return-1
		for(int i=0;i<list.size();i++) {
			if (list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
