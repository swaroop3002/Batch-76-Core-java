package com.logical_Statements;

import java.util.Scanner;

//Logical Statements ---> if , else , else if   

public class TestLSDemo {

	public static void main(String[] args) {
		System.out.println(" Main method started .......");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
//		if we use i condition without curly braces [ {} ] if condition is true prints the both statements
//		 if false , it consider only only first statement and prints the second statement without any doubt 
//		we cannot use for ELSE like this because else must need IF condition
//		if (age > 18)
//			System.out.println("congratulations ");
//		    System.out.println("you are eligible for voting >>>");
		
		if(age > 18) {
			System.out.println("you are eligible for voting .....");
			
		}else {
			System.out.println(" Sry to say ! , You are no eligible for voting  ");
		}
	}

}
