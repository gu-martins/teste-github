package application;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("digite um numero");
		int n=sc.nextInt();
		
		int[][] matriz=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int c=0;c<n;c++) {
				System.out.println("digite a matriz");
				matriz[i][c]=sc.nextInt();
			}
		}
		System.out.println("main diagonal: ");
		for(int i=0;i<matriz.length;i++) {
			System.out.print(matriz[i][i]+" ");
		}
		int count=0;
		for(int i=0;i<matriz.length;i++) {
			for(int c=0;c<matriz[i].length;c++) {
				if(matriz[i][c]<0) {
					count++;
				}
			}
		}
		System.out.println("negative numbers: "+count);
		
		sc.close();
	}

}
