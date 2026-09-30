package com.logical_Statements;

import java.util.Scanner;

public class TestDemsLS1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number i'll tell you that is that even or odd .....");
		int number = sc.nextInt();
		if(number %2 == 0) {
			System.out.println("It is an even number : " + number);
		}else {
			System.out.println("The number is Odd : " + number);
		}

	}

}
