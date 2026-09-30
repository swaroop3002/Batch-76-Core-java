package com.logical_Statements;

import java.util.Scanner;

public class TestL_SDemo9 {
	
	//- WAP to take the input from the Customer and give the Total Invoice bill for the customer.
	//- Customer may select fruits & vegetables
	//- As a Vendor we need to provide bill as a invoice.

	public static void main(String[] args) {
		System.out.println("Wel come to super market : ");
		Scanner sc = new Scanner(System.in);
		
		double vegPrice = 0;
		double fruPrice = 0;
		double totalPrice = 0;
		
		System.out.println("Enter your catagory : ");
		String cat = sc.next();
		switch(cat) {
		case "veg" ->{
			String VegYesNo ="";
			do {
				System.out.println("Enter your item : ");
				String item = sc.next();
				switch(item) {
				case "potato" -> {
					System.out.println("the potato per kg is 40 rupies : ");
					double potatoPrice = 40.0;
					vegPrice = vegPrice + potatoPrice;
				}
					case "tomato" ->{
						System.out.println("The tomato per kg is 50 rupies : ");
						double tomatoPrice = 50;
						vegPrice = vegPrice + tomatoPrice;
					}
						case "Brinjal" -> {
							System.out.println("the brinjal per kg is 45 rupies : ");
							double brinPrice = 45;
							vegPrice = vegPrice + brinPrice;
						}
						case "Ladisfinger" ->{
							System.out.println("\"the Ladisfinger per kg is 45 rupies : \"");
							double lfPrice = 50;
							vegPrice = vegPrice + lfPrice;
						}
						default -> System.out.println("Sry sir Entered item is not available in our store :");
				}
				System.out.println("Do you want to continue with Vegetables click Yes or NO : ");
				VegYesNo= sc.next();
			}while (VegYesNo.equalsIgnoreCase("Yes"));
			System.out.println("Exit from the Vegetables ::: ");
			System.out.println("Total vegetables price is : " + vegPrice);
		}
		}
	}

}
