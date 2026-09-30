package com.logical_Statements.loops1;
// Digit sum adding the numbers as per the order eg: input 123 output: 1+2+3 = 6
import java.util.Scanner;

public class DigitSum {

	void main(String[] args) {
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sumOfDigits = sumOfDigits(n);
		System.out.println("sum of digits : " + sumOfDigits);

	}
	int sumOfDigits(int n) {
		int sum = 0;
		int r = 0;
		while(n > 0) {
			r= n%10;
			n = n/10;
			sum = sum + r;
		}
		return sum;
		
	}

}
