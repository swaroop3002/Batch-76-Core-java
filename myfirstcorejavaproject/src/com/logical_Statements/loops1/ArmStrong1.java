package com.logical_Statements.loops1;

import java.util.Scanner;

public class ArmStrong1 {
	static  boolean isArmStrong(int n) {
		boolean status = false;
		
		int r = 0;
		int sumP = 0;
		int temp = n;
		
		int n1 = n;
		int count = 0;
		while(n1 > 0) {
			n1 = n1 / 10;
			count++;
		}
		while(n > 0) {
			r = n % 10; // 153 --> 3 --> 5 -->1
			n = n / 10; // 153--> 15 
			sumP = sumP + r * r * r; // 27 + 125 + 1 = 153
		}
		if(sumP == temp) {
			status = true;
		}
		
		return status;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started : ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean status = isArmStrong(n);
		if(status) {
			System.out.println("The entered number is a ArmStrong : ");
		}else {
			System.out.println("The entered number is not a ArmStrong : ");
		}

	}

}
