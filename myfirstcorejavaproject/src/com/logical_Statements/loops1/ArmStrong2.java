package com.logical_Statements.loops1;

import java.util.Scanner;

public class ArmStrong2 {
	static boolean isArmStrong(int n) {
		boolean status = false;
		int r =0;
		int sumP = 0;
		int temp = n;
		
//		To find the count of the given number
		
		String str = Integer.toString(n);
		int digitCount = str.length();
		
		while(n > 0 ) {
			r = n % 10;
			n = n / 10;
//			sumP = sumP + r * r * r;
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}
		if(sumP == temp) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("Find the given number is an ArmStrong or Not : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		boolean status = isArmStrong(n);
		if(status) {
			System.out.println("the entered number is ArmStrong : ");
		}else {
			System.out.println("the entered number is not a ArmStrong : ");

		}

	}

}
