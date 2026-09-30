package com.operator_in_java;

//import sun.security.util.Cache.EqualByteArray;

public class Test_Relationa_Op_Demo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a != b);
		System.out.println(a != c);
	    System.out.println(a <= b);
	    System.out.println(a >= b);
	    System.out.println(a >= c);
	    System.out.println(a < c);
	    System.out.println(a > c);
	    System.out.println(a > b);
	    System.out.println(a < b);
	    System.out.println(a < c);
	    
	    String x = "Java";
	    String y = "java";
	    System.out.println(x = y);
	    System.out.println(x.equalsIgnoreCase(y));
	    
	    System.out.println(" ");
	    String s1 = "Ball";
	    String s2 = "baba";
	    
	    System.out.println(s1.equalsIgnoreCase(s2));
	}

}
