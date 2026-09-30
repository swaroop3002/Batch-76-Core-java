package com.logical_Statements;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.println(" your are eligible for the movie to watch , Have fun uhhh ....." );
		}else {
			System.out.println("your are age is not matched to watch this movie , come again after a year : ");
		}

	}

}
