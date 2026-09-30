package com.javaintro;

public class User {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized invoke");
	}

	public static void main(String[] args) {
 
		
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		
		//Nullifying the object 
		
		u1 = null;
		
		//Re-assigining the object
		User u4 = new User();
		u2 = u4;
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		
		System.gc();
	}

}
