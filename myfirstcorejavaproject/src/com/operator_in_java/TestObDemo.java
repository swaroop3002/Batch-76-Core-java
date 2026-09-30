package com.operator_in_java;

import java.util.Scanner;

public class TestObDemo {

	void main(String[] args) {
		
//	    int a = 20;
//	    int b = 30;
//		
//		System.out.println(" addition of two numbers : " + (a + b));
//
//		System.out.println(" multiplication of two numbers : " + a * b );
//		System.out.println("Division of two numbers : " + a / b);
		System.out.println(" Main method started ...");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number : ");
	    float a1 = sc.nextFloat();
	    
	    System.out.println("Enter the second Number : ");
	    double a2 = sc.nextDouble();
	    
	    double sum = addition(a1,a2);
	    System.out.println("Sum of two Numbers : " + sum);
	    
//	    int a = 20;
//	    int b = 30;
//	    System.out.println(" addition : " + a + b);  it takes as a string and give output as : 2030.
//	    System.out.println(" addition : " + (a+b));
//	    System.out.println(" addition of two numbers : " + a + b);
	    
	    
	    System.out.println(" lets do substraction : ");
	    
	    System.out.println(" Enter the first number : ");
	    int a3 = sc.nextInt();
	    
	    System.out.println("Enter the second number : ");
	    float a4 = sc.nextFloat();
	    int difference = substraction(a3 , a4);
		System.out.println("Substraction of two numbers : " + difference);
		
		System.out.println(" Lets do multiplication : ");
		System.out.println(" Enter first Number : ");
		float a5 = sc.nextFloat();
		
		System.out.println(" Enter second Number : ");
		float a6 = sc.nextFloat();
		float product = multiplacation(a5,a6);
		System.out.println("Muntiplication of two Numbers : " + product);
		
		System.out.println(" Lets do division : ");
		System.out.println(" Enter the first number : ");
		short a7 = sc.nextShort();
		
		System.out.println(" Enter the second number : ");
		byte a8 = sc.nextByte();
		
		short quotient = division(a6,a7); 
		System.out.println("Division of two numbers : " + quotient);
		
		System.out.println(" Lets do Modules : ");
		System.out.println(" Enter the first number : ");
		int a9 = sc.nextInt();
		System.out.println(" enter the second number : ");
		int a10 = sc.nextInt();
		int reminder = modules(a9,a10);
		System.out.println(" Modules of two numbers : " + reminder);
	}

	 double addition(float a , double b) {
		double sum = a + b;
		return sum;
	}
	 int substraction(int a1 , float b1) {
		 int difference = (int) (a1 - b1);
		 return difference;
	 }
	 float multiplacation( float a2 , float b2) {
		float product = a2 * b2;
		return product;
	 }
	 
	 short division(float a3, short b3) {
		 short quotient = (short) (a3/ b3);
		 return quotient;
	 }
	 
	 int modules(int a4 , int b4 ) {
		 int reminder = a4 % b4;
		 return reminder;
	 }
}

