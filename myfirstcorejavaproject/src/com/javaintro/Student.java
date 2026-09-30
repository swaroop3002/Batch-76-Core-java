package com.javaintro;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Welcome to java World !");
		
		System.out.println(Class.forName("com.javaintro.HelloWorld"));
		
		
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		
		System.out.println(Class.forName("java.lang.String"));
		
		System.out.println(Class.forName("java.lang.System"));

		
	}
}
