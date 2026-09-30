package com.logical_Statements.loops1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		while(n > 0) {
			int  r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		System.out.println("sum is : " + sum);

	}

}
