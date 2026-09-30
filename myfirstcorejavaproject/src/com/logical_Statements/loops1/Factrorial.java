package com.logical_Statements.loops1;

import java.util.Scanner;

public class Factrorial {
	public static void main(String[] args) {
		System.out.println("Find the factroial of the given number : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		int fact = findFact(n);
		System.out.println("Factorial of the given number : " + fact);
	}
	static int findFact(int n) {
	
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * findFact(n-1); // 6*6-1=30 , 
	}
}
