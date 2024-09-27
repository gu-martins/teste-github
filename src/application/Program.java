package application;

import java.util.Locale;
import java.util.Scanner;

import entities.StockProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter product data: %n");
		System.out.print("Name: ");
			String name=sc.nextLine();
		System.out.print("Price: ");
			double price=sc.nextDouble();
					
		StockProduct product=new StockProduct(name, price);
			
		System.out.println();
		System.out.println("product data: "+product);
		
		System.out.println();
		System.out.println("enter the number of products to be added in stock: ");
			int quantity=sc.nextInt();
			product.addProducts(quantity);
		
		System.out.println("updated data: "+product);
		System.out.println();
		
		System.out.println("enter the number of products to be removed from stock: ");
			quantity=sc.nextInt();
			product.removeProducts(quantity);
	
		System.out.println();
		System.out.println("update data: "+product);
				
		sc.close();
	}

}
