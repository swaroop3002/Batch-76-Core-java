package com.logical_Statements;

import java.util.Scanner;

public class CollegeAdmission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Intermediate marks : ");
		int marks = sc.nextInt();
		if(marks >= 900) {
			System.out.println("Your are eligible for the CSE branch in Sri indu college of engineering college : ");
		}else if(marks >= 800) {
			System.out.println("Your are eligible for the DATA_SCIENCE branch in Sri indu college of engineering college : ");
		}else if(marks >= 600) {
			System.out.println("Your are eligible for the EEE branch in Sri indu college of engineering college : ");
		}else {
			System.out.println("Sorry to say you are not eligible for any branch in Sri indu college of engineering college : ");
		}

	}

}
