package com.logical_Statements.loops1;

import java.util.Scanner;

public class FindFactors {

	public static void main(String[] args) {
		System.out.println(" Find the factors for the given number : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int N = sc.nextInt(); //8
		
//		to store multiple values we have to take a method and store the result in that method : 
		
		fingFactorss(N);

	}
	static void fingFactorss(int N) {
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				System.out.println("The factors of given number is : " + i);
			}
		}
	}

}
