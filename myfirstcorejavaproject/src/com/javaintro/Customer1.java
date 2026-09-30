package com.javaintro;

public class Customer1 {
	
	@Override
	protected void finalize() {
		System.out.println("final method called");
	}
	
	void swaroop() {
		
		Customer1 sw = new Customer1();  // Object Method inside
		System.out.println(sw);
	}

	public static void main(String[] args) {

		System.out.println("main method startd");
		
		Customer1 c2 = new Customer1();
		System.out.println(c2);
		
		Customer1 c3 = new Customer1();
		System.out.println(c3);
		
		Customer1 c4 = new Customer1(); // if we are not executing the c4 object to returns empty space
		System.out.println();
		
		
		int i = 0x1dbd16a6;
		System.out.println(i); //498931366(hash code of the c2)
		
		c2 = null;
		System.out.println(c2); // Nullifying object
		
		c2 = c3 ;   //reassigning object
		System.out.println(c3);
		
		// anonymous object
		
		new Customer1();
		
		
		
		System.gc();
	}

}
