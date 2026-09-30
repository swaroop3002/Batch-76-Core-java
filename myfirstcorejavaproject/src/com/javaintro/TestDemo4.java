package com.javaintro;

public class TestDemo4 {
	
	//static Block
	static {
		System.out.println("static block called");
	}
	
	//Instance Block
	{
		System.out.println("instance block called");
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		
		TestDemo4 t3 = new TestDemo4();
		
		System.out.println("main method ended");
	}

}       
