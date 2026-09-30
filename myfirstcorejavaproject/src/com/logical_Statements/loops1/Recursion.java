package com.logical_Statements.loops1;

// Factorial of the given number : 
import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		System.out.println("Find the factorial of the given number : ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int fact = findFact(n);
		System.out.println("The factorial of the given number : " + fact);
		

	}

	static int findFact(int n) {
		if (n == 0 || n == 1) { 
			return 1;
		}
		return n*findFact(n-1);
		
//		5*findFact(4) -->5 * 24 = 120
//		4*findFact(3) -->4 * 6 = 24
//		3*findFact(2) --> 3 * 2 = 6
//		2*findFact(1) --> 2 * 1 = 2

		
	}
}
