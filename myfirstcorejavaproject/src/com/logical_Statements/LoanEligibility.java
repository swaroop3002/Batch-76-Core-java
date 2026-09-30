package com.logical_Statements;

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary per month : ");
		double salary = sc.nextDouble();
		if(salary >= 100000) {
			System.out.println("Congrats you are eligible for 2000000 loan : ");
		}else if(salary >= 70000) {
			System.out.println("Congrats you are eligible for 1500000 loan : ");
		}else if(salary >= 50000) {
			System.out.println("Congrats you are eligible for 1000000 loan : ");
		}else if (salary >= 30000) {
			System.out.println("Congrats you are eligible for 500000 loan : ");
		}else {
			System.out.println("Sorry to say your monthly salary dose't match our terms and conditions You are not eligible for any loan in our bank: ");
		}

	}

}
