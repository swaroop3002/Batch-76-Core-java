package com.logical_Statements.loops1;

import java.util.Scanner;

// 6 , 28 , 496 , 8128 these are the prefect numbers :

public class Perfect1 {

	public static void main(String[] args) {
		
		System.out.println("Find the given number is perfect or not : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i < n ; i++) {
			if(n%i == 0) {
				sum = sum + i;
//				System.out.println();
			}
		}
		if (sum == n) {
			System.out.println("The entered number is Perfect : " + n);
		}else {
			System.out.println("The entered number is NOt Perfect : " + n);
		}
		
		sc.close();

	}

}
