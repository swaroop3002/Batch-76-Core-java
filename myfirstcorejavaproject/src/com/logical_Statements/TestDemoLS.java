package com.logical_Statements;

import java.util.Scanner;

public class TestDemoLS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your name : ");
		String nameLength = sc.nextLine();
		
		if(nameLength.length() <= 10 ) {
			System.out.println("Hay mister : " + nameLength);
			System.out.println("you have such a nice name : 🌞");
			
		}else {
			System.out.println("Your name is too long,pleas enter shorter name");
		}

	}

}
