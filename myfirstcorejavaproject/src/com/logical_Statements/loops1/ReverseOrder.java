package com.logical_Statements.loops1;

import java.util.Scanner;

public class ReverseOrder {

	void main(String[] args) {
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int rev = reverseOrder(n);
		System.out.println("the entered number in reverse order is : " + rev);

		System.out.println("mein method ended : ");

	}
	int reverseOrder(int n) {
		int rev = 0;
		int r = 0;
		while(n > 0) {
			r = n%10;
			n = n/10;
			rev = rev * 10 + r; 
		}
		return rev;
	}

}
