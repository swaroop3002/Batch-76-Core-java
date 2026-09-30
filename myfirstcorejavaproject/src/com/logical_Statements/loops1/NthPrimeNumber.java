package com.logical_Statements.loops1;

import java.util.Scanner;

public class NthPrimeNumber {

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to parint ? ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		System.out.println("main method ended : ");

	}

}
