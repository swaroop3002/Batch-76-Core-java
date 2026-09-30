package com.javaintro;

public class Product {

	int pid;
	String pname;
	int pprice;
	String pinfo;
	static String companyname;

	public static void main(String[] args) {

		Product p1 = new Product();

		p1.pid = 2511910;

		p1.pname = "Mushroom";
		
		p1.pprice = 90;
		
		p1.pinfo = "Milkey mushrooms fully natural product";

		companyname = "Beejveda naturals";
		p1.show();
		
		Product p2 = new Product();

		p2.pid = 2;
		p2.pname = "mangos";
		p2.pprice = 200;
	    p2.pinfo = "Very good product";
		
		p2.show();

	}

	void show() { //using show() method for printing the values
		System.out.println("product ID : " +pid);
		System.out.println("Name of the product : " +pname);
		System.out.println("Price fo 1/4 kg : " + pprice);
		System.out.println("product Information : "  + pinfo);
	System.out.println("Name of the company : " + companyname);
		
	}

}
