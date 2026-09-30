package com.logical_Statements;

import java.util.Scanner;

public class T_Shirt {

	public static void main(String[] args) {
		System.out.println("Wel come to Trends shopping : ");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your size in numbers : ");
		int size = sc.nextInt();

		switch(size) {
		
		case 28 : System.out.println("Your T-shirt size is Small : " + size);
		break;
		case 30 : System.out.println("Your T-shirt size is Medium : " + size);
		break;
		case 32 : System.out.println("Your T-shirt size is Large : " + size);
		break;
		case 36 : System.out.println("Your T-shirt size is X-Large : " + size);
		break;
		case 40 : System.out.println("Your T-shirt size is  XX-Large : " + size);
		break;
		default : System.out.println("Sry to say that , Your size is not available : ");
		
		}
	}

}
