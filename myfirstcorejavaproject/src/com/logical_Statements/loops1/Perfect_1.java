package com.logical_Statements.loops1;

import java.util.Scanner;

public class Perfect_1 {

	public static void main(String[] args) {
		
		System.out.println("Check that the given number is perfect or not : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i < n;i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
	
		if(sum == n) {
			System.out.println("The entered number is a perfect Number : ");
		}else {
			System.out.println("The entered number is not a perfect number : ");
		}
	}
}
