package enquanto;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("digite um numero%n (0 interrompe)");
		int x=sc.nextInt();
		int soma=0;
		
		while (x!=0) {
			soma+=x;
			x=sc.nextInt();			
		}
		
		System.out.println(soma);
		
		
		sc.close();
	}

}
