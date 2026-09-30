package com.logical_Statements.loops1;

import java.util.Scanner;

// WAP to find the febbinocces series 
//input : 10
// febbinocces series :  [0 1] =>Default values 0 1 1 2 3 5 8 13 21 34 --- up to 10 digits.
public class Febbinoccies_series {

	public static void main(String[] args) {
		System.out.println("Find the fibbinoccies Series of the given number : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int feb = findFeb(n);
	}

	static int findFeb(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println(n3);
		
		for(int i = 1; i <= n ; i++) { // we can use i <= n-2 also because already n1 and n2 is printed right .
//			n1 = n2;
//			n2 = n3;
			n3 = n1 + n2;
			System.out.print(n3 + " " );
			n1 = n2;
			n2 = n3;
					
		}
		return n;
	}
}
