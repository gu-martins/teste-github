package entrada;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		System.out.println("digite um numero ");
		
		x=sc.nextInt();
		sc.nextLine();
		
		System.out.println("digite algo ");
			s1=sc.nextLine();
		System.out.println("digite algo");
			s2=sc.nextLine();
		System.out.println("digite algo");
			s3=sc.nextLine();
		
		System.out.println("voce digitou "+s1+s2+s3+x);
		sc.close();
		
	}

}
