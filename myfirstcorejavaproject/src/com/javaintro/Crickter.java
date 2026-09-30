package com.javaintro;

public class Crickter {
	//Declaration
	//instance variable
	
	int jerseyNo;
	String CrickterName;
	
	//Static variable
	
	static int countryId;
	static String countryName;

	public static void main(String[] args) {
		System.out.println("Wel come to indian cricket team");
		
		//Initialization
		countryId = 100;
		countryName = "India";
		
		//Accessing
		System.out.println(countryId);
		System.out.println(countryName);
//      we cannot access, instance datain static area.
//      if we want to Access indtance data in static area, we must need to create
		//Object.
//      Cannot make a static reference to the non- static field
// jerseyNo
//      System.out.println(jerseyNo);
//      Cannot make a static reference to the non-static field
// cricketerName;	
		//System.out.println(cricketer Name);
		
		
	}

}
