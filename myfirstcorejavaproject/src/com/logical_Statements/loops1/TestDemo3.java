package com.logical_Statements.loops1;

// WAP to find the odd numbers from 0 to given number : 

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("Find the Odd number in between 0 to given number : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i = 0 ; i <= num; i++) {
			if(i % 2 == 1 ) {
				System.out.print(i + " ");
			}

		}

	}

}
