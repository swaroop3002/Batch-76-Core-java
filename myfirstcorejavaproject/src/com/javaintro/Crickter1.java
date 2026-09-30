package com.javaintro;

public class Crickter1 {
	
	int jerseyNo;
	String crickterName;
	String crickterVillage;
	int crickterAge;
	int crickterCenturies;
	
	static int countryId;
	static String countryName;

	public static void main(String[] args) {
		
		System.out.println("wel come to team india !");
		
		countryId = 91;
		countryName = "INDIA";
		
		
		
		Crickter1 rohit = new Crickter1();
		rohit.jerseyNo = 45;
		rohit.crickterName ="rohitsherma";
		
		System.out.println(countryId);
		System.out.println(countryName);
		System.out.println(rohit.jerseyNo);
		System.out.println(rohit.crickterName);
		System.out.println("*******O********B");
		
		Crickter1 virat = new Crickter1();
		virat.jerseyNo = 18;
		virat.crickterName = "Virat Kholi";
		virat.crickterVillage = "Delhi";
		virat.crickterAge = 36;
		virat.crickterCenturies = 6000;
		
		System.out.println("Country ID : "+ countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("jersey No : " + virat.jerseyNo);
		System.out.println("crickter Name : " + virat.crickterName);
		System.out.println("Village : " + virat.crickterVillage);
		System.out.println("Age : " + virat.crickterAge);
		System.out.println("Centuries : " + virat.crickterCenturies);
		
	}

}
