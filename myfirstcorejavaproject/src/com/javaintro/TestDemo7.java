package com.javaintro;

public class TestDemo7 {
	
	static {
		hello();
	
	}

	TestDemo7 t1 = new TestDemo7();
	
	//t1.hi();
	//t1.sam();

	void hi() {
		System.out.println("Instance method called");
	}
	
	void sam() {
		System.out.println("Instance method 2 called");
	}
	static void hello(){
		
		System.out.println("Static method called");
		
	}

	public static void main(String[] args) {
		//System.err.println(t1.sam);
		
		//TestDemo7 t1 = new TestDemo7();
		//t1.hi();
		//t1.sam();
		
		
	}

}
