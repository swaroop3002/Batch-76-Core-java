package com.logical_Statements;

import java.util.Scanner;

public class ShoppingDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your total shopping amount : ");
		int amount = sc.nextInt();
		
		if(amount >= 5000 && amount <= 6000) {
			System.err.println("you are eligible for 20% of discount : " );
			System.out.println("Thank you for visiting : ");

		}else if(amount >= 2000) {
			System.out.println("You are eligible for 10% of discount : ");
			System.out.println("Thank you for visiting : ");

		}else if(amount >= 1000) {
			System.out.println("You are eligible for 5% of discount : ");
			System.out.println("Thank you for visiting : ");

		}else {
			System.out.println("There is not eligible for any discount ");
			System.out.println("Thank you for visiting : ");
		}
		

	}

}
