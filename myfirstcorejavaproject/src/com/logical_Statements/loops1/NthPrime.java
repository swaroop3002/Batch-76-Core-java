package com.logical_Statements.loops1;

import java.util.Scanner;

public class NthPrime {

	static boolean isPrime(int n) {
		boolean status = true;
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				status = false;
				
				break;
			}
		}
		return status;

	}
	public static void main(String[] args) {
	
		System.out.println("check the prime numbers up to nth :");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int count = 0;
		
		boolean flag = isPrime(n);
		if(flag) {
			System.out.println("it is a prime ");
		}else {
			System.out.println("it is not a prime ");
		}
	}
	
}
