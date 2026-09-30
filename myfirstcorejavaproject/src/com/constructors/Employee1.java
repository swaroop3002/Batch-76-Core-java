package com.constructors;

public class Employee1 {
	
	int empid;
	String empname;
	
	Employee1(int empid,String empname){
		System.out.println("2 arg constructor called : ");
		this.empid = empid;
		this.empname = empname;
		
		
	}
	

	public static void main(String[] args) {
		Employee1 e = new Employee1(001,"Swaroop");
		
		System.out.println("main method started : ......");
		e.getEmpInfo();
	}
	
	void getEmpInfo() {
		System.out.println("Employee Id : " + empid);
		System.out.println("Employee Name : " + empname);
		
	}

}
