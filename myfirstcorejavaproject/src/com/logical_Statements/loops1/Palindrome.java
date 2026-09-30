package com.logical_Statements.loops1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();;
		boolean status = isPalin(n);
		if(status){
			System.out.println("the given number is Palindrome : ");
		}else {
			System.out.println("the given number is not a Palindrome : ");
		}
		System.out.println("main method ended : ");

	}
	static boolean isPalin(int n) {
		boolean status = false;
		int r = 0;
		int rev = 0;
		int temp =0;
		while(n > 0) {
			r = n %10;
			n = n/10;
			rev = rev * 10 + r;	
		}
		if(rev == temp) {
			status = true;
			
		}
		return status;
	}

}
