package com.logical_Statements;

import java.util.Scanner;

public class TestDemoLS2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		if(number >= 0) {
			System.out.println("It is an a positive number : " + number);
		}else {
			System.out.println("It is an a negitive number : " + number);
		}

	}

}
