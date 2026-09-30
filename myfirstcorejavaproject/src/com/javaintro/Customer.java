package com.javaintro;

public class Customer {
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("finilized method called");
	}

	public static void main(String[] args) {

		System.out.println("main method starded");
		
		Customer c1 = new Customer();
		System.out.println(c1);
		
		Customer c2 = new Customer(); //2060468723
		System.out.println(c2);
		
		Customer c3 = new Customer();
		System.out.println(c3);
		
		Customer c4 = new Customer();
		System.out.println(c4);
		
		//Nullifying method
		c1 = null;
		c2 = null;
		c3 = null;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c4);
		System.gc();
		
		int i = 0x7ad041f3;
		System.out.println(i);
	}

}
