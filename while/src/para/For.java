package para;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.printf("qnts numeros quer somar? %n");
		int N=sc.nextInt();
		
		
		int soma=0;
		for(int i=0;i<N;i++) {
			System.out.println("digite um numero");
			int x=sc.nextInt();
			soma+=x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
