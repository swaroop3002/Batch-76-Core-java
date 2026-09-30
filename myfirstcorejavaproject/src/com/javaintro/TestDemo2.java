package com.javaintro;

public class TestDemo2 {
	
	//Instance Method
	void hello(){
		System.out.println("Hello Guys Good Morning , Have a Nice Day..");
		
	}
	
	//Static Method
	static void welcome() {
		System.out.println("Welcome to jave world ");
	}

	//main Method
	public static void main(String[] args) {
		
		System.out.println(" Main method started ! ");
         
		TestDemo2 t = new TestDemo2();
		
		welcome();
		
	    t.hello();
		
		System.out.println(" Main method ended ..");
	}

}
