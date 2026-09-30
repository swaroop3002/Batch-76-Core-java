package com.logical_Statements;

import java.util.Scanner;

public class OnlineShoppingLS1 {

	public static void main(String[] args) {
		System.out.println("Wel come to Online shopping mall ..... ");
		Scanner sc = new Scanner(System.in);
		double ElectronicsPrice = 0;
		double ClothingPrice = 0;
		double GroceryPrice = 0;
		
		System.out.println("Enter Your categorie : ");
		String cate = sc.next();
		switch(cate) {
		case "Electronics" ->{
			String eleYesNO = "";
			do {
				System.out.println("enter Your item : ");
				String item = sc.next();
				switch(item) {
				case "tv" -> {
					System.out.println("the price of the tv is 1245000 ");
					double tvPrice = 1245000;
					ElectronicsPrice = ElectronicsPrice + tvPrice;
				}
				case "Mobile"->{
					System.out.println("the mobile price is 250000");
					double mPrice = 250000;
					ElectronicsPrice = ElectronicsPrice + mPrice;
				}
				default -> System.out.println("Entered item is not available in our store : ");
				}
				System.out.println("Do You want to continue with fruits click Yes or NO : ");
				eleYesNO =sc.next();
			}while(eleYesNO.equalsIgnoreCase("Yes"));
			System.out.println("Exit from the electronic Page !!!!");
			System.out.println("Total Electronics price is : " + ElectronicsPrice);

			
		}
		case "Clothing"->{
			String cYesNO = "";
			do {
				System.out.println("Enter your item : ");
				String item = sc.next();
				switch(item) {
				case "Shirts"->{
					System.out.println("the shirt Price is 1500 : ");
					double sPrice = 1500;
					ClothingPrice =ClothingPrice + sPrice;
				}
				case "Short"->{
					System.out.println("the shirt Price is 1500 : ");
					double shPrice = 1500;
					ClothingPrice =ClothingPrice + shPrice;
				}
				case "Pant"->{
					System.out.println("the Pant Price is 2000 : ");
					double pPrice = 1500;
					ClothingPrice =ClothingPrice + pPrice;

				}
				case "Bleaser"->{
					System.out.println("the Bleaser Price is 1500 : ");
					double bPrice = 1500;
					ClothingPrice =ClothingPrice + bPrice;

				}
				default -> System.out.println("Entered item is not in the store : ");
				}
				System.out.println("Do You want to continue with fruits click Yes or NO : ");
				cYesNO = sc.next();
				
			}while(cYesNO.equalsIgnoreCase("Yes"));
			System.out.println("Exit from the Clothing Page !!!!");
			System.out.println("Total Clothing Price is : " + ClothingPrice);

			
		}

		case "Grocery" ->{
			String gYesNo = "";
			do {
				System.out.println("Enter your item : ");
				String item = sc.next();
				switch(item) {
				case "Dhal" ->{
					System.out.println("the dhal price is 200 per kg : ");
					double dhalPrice = 200;
					GroceryPrice = GroceryPrice + dhalPrice;
				}
				case "suger" ->{
					System.out.println("the suger price is 80 per kg : ");
					double sugerPrice = 80;
					GroceryPrice = GroceryPrice + sugerPrice;
				}
				case "atta" ->{
					System.out.println("the atta price is 100 per kg : ");
					double attaPrice = 100;
					GroceryPrice = GroceryPrice + attaPrice;
				}
				default -> System.out.println("Entered item is not available in the store :");
				}
				System.out.println("do you want to continue Enter Yes or No : ");
				gYesNo = sc.next();
			}while(gYesNo.equalsIgnoreCase("Yes"));
			System.out.println("You are exited from Grocery page : ");
			System.out.println("Total grocerys price is : " + GroceryPrice);
		}
		}

	}

}
