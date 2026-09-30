package com.logical_Statements;

import java.util.Scanner;

public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("Wel come to Driving Shool ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligible for voting .....");
		}else {
			System.out.println("You are not eligible for voting , go to school ");
		}
		
	}

}
