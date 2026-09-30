//Stack area method

package com.javaintro;

public class TestDemo3 {
	
	static TestDemo3 t = new TestDemo3();

	static void method1(){
		method2();
		System.out.println("print method one");
	}
	
	static void method2(){
		method3();
		System.out.println("print method two");
		
	}
	
	static void method3(){
		t.method4();
		System.out.println("print method three");
		
	}
	void method4() {
		t.method5();
		System.out.println("print method four");
	}
	void method5() {
		System.out.println("print method five");
	}	
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		method1();
		
		System.out.println("Main method ended ");
	}

}
