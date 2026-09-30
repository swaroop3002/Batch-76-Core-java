package com.logical_Statements.loops1;

import java.util.Scanner;

//Q) WAP to print the Given number is Armstrong or not ..?  

//An Armstrong number (also called a narcissistic number) is a number 
//that equals the sum of its own digits 
//each raised to the power of the total number of digits.
//—for example, 153 = 1³ + 5³ + 3³.
//Armstrong Number : 
//ex: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 
//ex: 370 = 3 ^3 + 7^3 + 0 = 27 + 343 = 370 
//ex: 371 = 3 ^3 + 7^3 + 1 = 27 + 343 + 1= 371
//ex: 1 = 1 to 9 

public class ArmStrong {
	static boolean isArmStrong(int  n) {
		boolean status = false;
		
		int r = 0;
		int sumP = 0;
		int temp = n;
		
		int n1 = n;
		int count = 0;
		while(n1 > 0) {
			n1 = n1 / 10;
			count++;
		}
//		String str = Integer.toString(n);
//		int digitCount = str.length();
		while(n > 0) {
			r = n % 10;
			n = n / 10;
			sumP = sumP + r * r * r ;
//			sumP = (int) (sumP + Math.pow(r,digitCount));
			
			
		}
		if(sumP == temp) {
			status = true;
		}
		return status;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		boolean status = isArmStrong(n);
		if(status) {
			System.out.println("the given numbar is a ArmStrong : ");
		}else {
			System.out.println("The given number is not a ArmStrong number ");
		}

	}

}
