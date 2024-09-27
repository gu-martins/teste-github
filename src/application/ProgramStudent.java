package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;



public class ProgramStudent {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Student student=new Student();
		
		System.out.println("NAME: ");
			student.name=sc.nextLine();
		System.out.println("GRADE 1: ");
			student.grade1=sc.nextDouble();
		System.out.println("GRADE 2: ");
			student.grade2=sc.nextDouble();
		System.out.println("GRADE 3: ");
			student.grade3=sc.nextDouble();
			
		if (student.finalGrade()>60) {
			System.out.printf("FINAL GRADE: %.2f%n PASS",student.finalGrade());
			}else {
				System.out.printf("FINAL GRADE: %.2f%n FAILED%n%.2f",student.finalGrade(),student.missingPoints());			
			}			
		sc.close();
	}

}
