package com.conditional_statements;

// WAP to Loan Eligibility Checker by using nested Conditions :
//Ask salary
//Check minimum salary
//Ask credit score
//Check employment status
//Ask existing loans
//Display loan eligibility

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wel come to Kotak bank of Finance and loans : ");
		boolean status = true;

			System.out.println("Enter your name : ");
			String name = sc.next();
			System.out.println("Hello good morning Mr." + name + "  nice to meet you .....");

			System.out.println("can you please enter your Monthly salary : ");
			double sal = sc.nextDouble();

			System.out.println("can you please enter your credit score : ");
			int crdScore = sc.nextInt();

//			System.out.println("can you please tell us that you any active loans : ");
//			String al= sc.next();

			if (sal >= 100000 && crdScore >= 715) {
				System.out.println("Oh ! Grate to Know about your details : ");

				System.out.println("Enter your age : ");
				int age = sc.nextInt();
				if (age >= 22) {
					System.out.println("Your age is eligible for the loan approval , happy to continue : ");

					System.out.println(
							"can you conform that you have any active loans or not if you have press yes Or else press No : ");
					boolean atvLoans = sc.nextBoolean();
					if (!atvLoans) {
						System.out.println("Great to Know that's good ******");

						System.out.println("You are eligible for the loan that you have requested amount is 100000 : ");

					} else {
						System.out.println("Sry sir contact us after clearing your previous loan : ");
					}

				} else {
					System.out.println("Sorry sir your age is lessthan our loan terms : ");
				}

			} else {
				System.out.println("Sorry sir we can approve loan upto 500000 : ");
			}

	}

}
