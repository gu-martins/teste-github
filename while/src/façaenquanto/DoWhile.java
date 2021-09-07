package façaenquanto;
import java.util.Scanner;
import java.util.Locale;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("digitem em celsius ");
				double c=sc.nextDouble();
			double f=9.0*c/5.0+32.0;
				System.out.printf("em fahrenheit: %.1f%n",f);
		
		System.out.print("deseja repetir (s/n)?");
			resp=sc.next().charAt(0);
		}while (resp!='n');
								
		sc.close();
	}

}
