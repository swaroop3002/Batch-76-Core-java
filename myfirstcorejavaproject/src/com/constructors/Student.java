package com.constructors;

public class Student {
	
	int sId;
	String name;
	int rollNo;
	double fee;

	Student(){
		
	}
	Student(int sId ,String name,int rollNo,double fee){
		this.sId = sId;
		this.name = name;
		this.rollNo = rollNo;
		this.fee = fee;
	}
	public static void main(String[] args) {
		System.out.println("the student details are : ");
		Student s = new Student(100,"Swaroop",0123,25000.0);
		s.displayStudentDetails();
		
		System.out.println("  ");
		Student s1 = s;
		s1.displayStudentDetails();

	}
	void displayStudentDetails() {
		System.out.println("Student Id : " + sId);
		System.out.println("Student name : " + name);
		System.out.println("Student rollNo : " + rollNo);
		System.out.println("Student fee : " + fee);
	}

}
