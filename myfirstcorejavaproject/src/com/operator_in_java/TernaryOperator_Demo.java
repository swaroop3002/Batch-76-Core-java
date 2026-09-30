package com.operator_in_java;

import java.util.Scanner;

public class TernaryOperator_Demo {

	    void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10 ;
		int b = 5;
		int max = (a > b) ? a : b;
		System.out.println(max);
		
		int age = 22;
		String eligible = (age > 23) ? "yes" : "no";
		System.out.println(eligible);
		
		System.out.println(" Enter the marks of the student : ");
		int marks = 90;
		int marks1 = sc.nextInt();
		String grade = (marks1 >= 90) ? "A" : (marks1 >= 80) ? "B" : (marks1 >= 70) ? "C" : (marks1 <= 50 )? "D" : "F";
		System.out.println("The student is :" + grade +   "-Grade");
		
		System.out.println("Enter the score of the player : ");
		int score =105;
		int score1 = sc.nextInt();
		String winner = (score1 >= 100)? "Player of the match" : (score1 >= 90)? "Best Power Play Player" : (score1 >= 80)? "Average Strike Rate" :"Better luck next time";
		System.out.println(winner);
		

	}

}
