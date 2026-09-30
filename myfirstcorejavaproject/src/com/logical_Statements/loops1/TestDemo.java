package com.logical_Statements.loops1;

//WAP to find the even numbers 

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
