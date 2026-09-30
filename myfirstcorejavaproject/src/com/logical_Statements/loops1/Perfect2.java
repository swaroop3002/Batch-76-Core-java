package com.logical_Statements.loops1;

import java.util.Scanner;

public class Perfect2 {

	public static void main(String[] args) {
		System.out.println("check that the given number is Perfect number or not : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum = sum + i;
//				System.out.println(i);
			}
		}
		if(sum == num) {
			
			System.out.println("The entered number is Perfect : " + num);
		}else {
			System.out.println("The entered number is Not Perfect Number : " + num);
		}

	}

}
