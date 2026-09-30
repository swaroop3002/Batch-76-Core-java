package com.logical_Statements.loops1;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		System.out.println("check the fibonocci series for the given number : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int feb = findFeb(n);
	}
	static int findFeb(int n){
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println(n3);
		for(int i = 1 ; i <= n; i++) {
			n3 = n1 + n2;
			System.out.println(n3 + "");
			n1 = n2;
			n2 = n3;
					
		}
		
		return n;
	}

}
