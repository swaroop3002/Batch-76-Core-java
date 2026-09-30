package com.operator_in_java;
// Unary Operator

// + - ++ --

public class TestUnary_Op_Demo {

	public static void main(String[] args) {
		System.out.println("Main method started ...");

		int a = 5;
		int b = 6;
		System.out.println(+a);// 5
		System.out.println(-b);// -6

		System.out.println(++a);
		System.out.println(--b);
		
		System.out.println(a++);// Output value is '6' but actual value is '7'

		System.out.println(b--);
		System.out.println(++a);
		System.out.println(--b);
		
	}

}
