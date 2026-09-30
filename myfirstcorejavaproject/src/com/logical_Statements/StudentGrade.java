package com.logical_Statements;

import java.util.Scanner;

public class StudentGrade {
	
	

	public static void main(String[] args) {
	System.out.println("Result of the sutdents ......");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Marks .....");

	int marks = sc.nextInt();
	
	if(marks > 100 || marks <= 0){
		
		System.out.println("Undefined marks.....");
		
	}else if (marks >= 93) {
		
		System.out.println("Your grade = A");
		
	}else if (marks >= 85) {
		
		System.out.println("Your grade = B");
		
	}else if(marks <=85 && marks >= 75) {
		
		System.out.println("Your grade = C");
		
	}
	else if(marks <= 74 && marks >= 60) {
		
		System.out.println("Your grade = D");
	}
	else if(marks <= 59 && marks >=35) {
		System.out.println(" Just passed ......");
	}
	else {
		System.out.println("The Student is failed ......");
	}

	}
}
