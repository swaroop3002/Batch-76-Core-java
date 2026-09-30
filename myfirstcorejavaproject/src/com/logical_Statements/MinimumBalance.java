package com.logical_Statements;

import java.util.Scanner;

public class MinimumBalance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how much amount is in your BankAccount : " );
		int accountBalance = sc.nextInt();
		if (accountBalance >= 500) {
			System.out.println("Very good your are maintaining minimum balance keep maintaining : " + accountBalance);
		}else {
			System.out.println("Your Bank balance is lessthan minimum balance it leads to block your account Pleas maintain minimum balance : " + accountBalance);
		}

	}

}
