package com.logical_Statements;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started : ");

		System.out.println("Enter The Gercy Number : " );
		int gercyNo = sc.nextInt();
		
		switch(gercyNo) {
		case 7:
			System.out.println("Mahendra sing Dhone + jercy number is " + gercyNo);
			System.out.println("Coolest captian in the indian cricket team : ");
			System.out.println("good keeper ......");
			break;
		case 8:
			System.out.println("Ravindhra Jadeja + jercu number is " + gercyNo);
			System.out.println("good spinner and good feilder : ");
			System.out.println("Always trust the god's plan ");
			break;
		case 45:
			System.out.println("Rohit Sherma jercy number : " + gercyNo);
			System.out.println("Good batsman and excelent captain for indian team : ");
			System.out.println("Record breaker ");
			break;
		case 18:
			System.out.println("Virat kohli jercy number : " + gercyNo);
			System.out.println("Good batsman and excelent in coverdrive shorts : ");
			System.out.println("Agression always on ");
			break;
		default :
			System.out.println("The enter gercy no is not matched with the Players with in the list : ");
		}
	}

}
