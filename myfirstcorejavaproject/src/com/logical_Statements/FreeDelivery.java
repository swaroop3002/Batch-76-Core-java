
package com.logical_Statements;

import java.util.Scanner;

public class FreeDelivery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your shopping amount : ");
		int amount = sc.nextInt();
		
		if(amount >= 5000) {
			System.out.println("Ohh! Congrats your are delivery is free of cost ");
		}else if(amount >= 2000) {
			System.out.println("you have to pay  29$ only for your delivery actual delivery fee is 80$ ");
		}else {
			System.out.println("You are no allowed to get free delivery for your products : ");
		}
				

	}

}
