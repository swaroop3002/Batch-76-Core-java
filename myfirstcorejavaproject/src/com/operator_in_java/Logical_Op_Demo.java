package com.operator_in_java;

public class Logical_Op_Demo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		
		// If first condition is false the second condition consider as [Dead code]
		System.out.println(true && true);
		System.out.println(false && true); 
		System.out.println(a < b && b > a);

		
//		[||] Or operator if one condition is True it Provides True
		System.out.println( a > b || a > b);
		System.out.println(a != b);
		System.out.println(a != c);
	}

}
