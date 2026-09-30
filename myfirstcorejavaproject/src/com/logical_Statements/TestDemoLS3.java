package com.logical_Statements;

import java.util.Scanner;

public class TestDemoLS3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your attendence percentage : ");
		int attendencePercentage = sc.nextInt();
		if(attendencePercentage >= 75 || attendencePercentage <= 100) {
			System.out.println("your eligible for the exam : " + attendencePercentage);
		}else {
			System.out.println("you are not eligilble for exam : " + attendencePercentage);
		}

	}

}
