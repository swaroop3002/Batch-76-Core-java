package com.logical_Statements;

import java.util.Scanner;

public class JobEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if( age >= 20) {
			System.out.println("Congrats your age is eligible for the SI [Sub_Inspector of police] : " );
		}else if(age >= 18 && age <= 26) {
			System.out.println("Congrats your age is eligible for ARMY : ");
		}else {
			System.out.println("Your age is not eligible for the above jobs : ");
		}
	}

}
