package com.logical_Statements;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		System.out.println("Wel come to our indian Restarent : ");
		Scanner sc = new Scanner(System.in);
//		double itemPrice = 0;
		double quantity = 0;
		double totalBill = 0;
		
		System.out.println(" ");
		System.out.println("Indian Restarent Menu : ");
		System.out.println(" ");
		System.out.println("Pizza - 200 rupies :");
		System.out.println("Burger - 120 rupies :");
		System.out.println("Biryani - 180 rupies :");
		System.out.println("Noodles - 100 rupies :");
		
		System.out.println("Select any item and quantity from the menu : ");
		String item = sc.next();
		switch(item) {
		case "Pizza" -> {
			System.out.println("You selected pizza per plate is 200 rupies: ");
			double pizzaPrice = 200;
			System.out.println("Enter the quantity : ");
			int quant = sc.nextInt();
			totalBill = pizzaPrice * quant;
			System.out.println("selected item  Noodles : " + "  Price : " + pizzaPrice + "  Quantity : " + quant + "  Total Bill is : " + totalBill);

			
		}
		case "Burger" ->{
			System.out.println("You selected Burger per plate is 120 rupies: ");
			double burgerPrice = 120;
			System.out.println("Enter your quantity : ");
			int quant = sc.nextInt();
			totalBill = burgerPrice * quant;
			System.out.println("selected item  biryani : " + "  Price : " + burgerPrice + "  Quantity : " + quant + "  Total Bill is : " + totalBill);

		}
		case "Biryani" ->{
			System.out.println("You selected Biryani per plate is 180 rupies: ");
			double biryaniPrice = 180;
			System.out.println("Enter your quantity : ");
			int quant = sc.nextInt();
			totalBill = biryaniPrice * quant;
			System.out.println("selected item  biryani : " + " Price : "  + biryaniPrice + "  Quantity : " + quant + "  Total Bill is : " + totalBill);
		}
		case "Noodles" ->{
			System.out.println("You selected Noodles per plate is 100 rupies: ");
			double noodlesPrice = 100;
			System.out.println("Enter your quantity : ");
			int quant = sc.nextInt();
			totalBill = noodlesPrice *quant;
			System.out.println("selected item  Noodles : " + "  Price : " + noodlesPrice + "  Quantity : " + quant + "  Total Bill is : " + totalBill);
		}
		default -> System.out.println("Selected item is no in our menu : ");
		}
	}
	

}
