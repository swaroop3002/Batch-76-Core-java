package com.logical_Statements;

import java.util.Scanner;

public class AtmWithdrawl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount in your account : ");
		int amount = sc.nextInt();
		if(amount >= 500) {
			System.out.println("Very good you are maintaining minimum balance in your account : ");
			System.out.println("The balance is sufficient you can withdraw your amount " + amount);
		}else if(amount >= 200) {
			System.out.println("Sorry to say that you are account balance is insufficient : " + amount);
		}else {
			System.out.println("insufficient balance withdrawl failed ........" + amount + " your amount");
		}
		
	}

}
