package com.logical_Statements;

// WAP to perform sum with symbols using switch case statements. 
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		System.out.println("wel come to rapid maths website : ");
		String sn = "";
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your first number : ");
			double number = sc.nextDouble();
			
			System.out.println("Enter your second number : ");
			double number1 = sc.nextDouble();
			
			System.out.println("Enter your symbol + - * / % : ");
			String sym = sc.next();
			
			switch (sym) {
			
			case "+" -> System.out.println("Sum of two Numbers is : " + (number + number1));
			
			case "-" -> System.out.println("Difference of two numbers is : " + (number - number1));
			
			case "*" -> System.out.println("product of two numbers is : " + (number * number1));

			case "/" -> System.out.println("quotient of two numbers is : " + (number / number1));

			case "%" -> System.out.println("Reminder of two numbers is : " + (number % number1));

			default -> System.out.println("You have entered wrong symbole : ");
			}
			System.out.println("Do you want to continue ...? Click S to continue or Click N to No");
			sn = sc.next();
		}while(sn.equalsIgnoreCase("y"));
		
		System.out.println("You Clicked for EXIT  !!!!!");
    }

}
