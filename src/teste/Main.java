package teste;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1="Computer";
		String product2="Office desk";
		
		int age=30;
		int code=5290;
		char gender='F';
		
		double price1=2100.0;
		double price2=650.50;
		double measure=53.234567;
		
		System.out.printf("Product is:%n %s which price is $ %.1f %n %s, wich price is $ %.2f %n ",product1,price1,product2,price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %s%n ",age,code,gender);
		System.out.printf("%nMeasure wich eight decimal places: %.8f %n",measure);
		System.out.printf("Rouded(three decimal places): %.3f %n ",measure);
		System.out.printf("US decimal point: %.3f",measure);
			Locale.setDefault(Locale.US);
			
			
	   }

}