package com.javaintro;

public class Employee {
	
	int eid;
	String enmae;
	static int orgID = 555;
	static String orgName = "Vcube";

	public static void main(String[] args) {
		
			Employee sr = new Employee();
			
			System.out.println(orgID);
			System.out.println(orgName);
			System.out.println(Employee.orgID);
			System.out.println(Employee.orgName);
			System.out.println(sr.orgID);
			System.out.println(sr.orgName);
			System.out.println("_------------------------");
			System.out.println(sr.eid);
			System.out.println(sr.enmae);
	}

}
