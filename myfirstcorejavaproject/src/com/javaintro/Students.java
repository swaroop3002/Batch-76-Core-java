package com.javaintro;

public class Students {
	
	void DisplayStudentDetails() {
		System.out.println("1 . studentid : 001 , student name : raju - Age - 20");
		
		System.out.println("2 . studentid : 002 , student name : ravi - Age - 23");
		
		System.out.println("3 . studentid : 003 , student name : raghu - Age - 24");
		
		System.out.println("4 . studentid : 004 , student name : ramesh - Age - 25");
	}
	
	static void DisplayCollegeName() {
		System.out.println("1 . Sri indu collage of engineering and technology");
		
		System.out.println("2 . Srinidhi collage of engineering and technology");
		
		System.out.println("3 . Sri Dattha collage of engineering and technology");
		
		System.out.println("4 . Sri CV raman collage of engineering and technology");

	}
	
	public static void main(String[] args) {

		System.out.println("Students with their colleges !");
		
		Students st = new Students();
		
		st.DisplayStudentDetails();
		
		DisplayCollegeName();
		
		System.out.println("Complete data about the students...");
	}

}
