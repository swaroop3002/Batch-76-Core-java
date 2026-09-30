package com.logical_Statements.loops1;

import java.util.Scanner;

//WAP to find a factorial using loop statement 

public class TestLPDemo {

	public static void main(String[] args) {
		
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		findFactor(n);
	}
	
	static void findFactor(int n) {
		for(int i = 1; i <= n; i++ ) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
