package programs_of_exam_Questions;

public class Student1 {
	
	Integer studentId;
	String studentName;
	Character gender;
	String branch;
	String collegeName;
	
	void displayStudentDetails() {
		System.out.println("Student Id : " + studentId );
		System.out.println("Student Name : " + studentName );
		System.out.println("Student Id : " + gender );
		System.out.println("Student Id : " + branch );
		System.out.println("Student Id : " + collegeName );
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
		s1.studentId =01;
		s1.studentName = "Swaroop";
		s1.gender = 'M';
		s1.branch = "Data Science";
		s1.collegeName = "Sri INDU college of eng & tech";
		
		
		s2.studentId = 02;
		s2.studentName = "minhaz";
		s2.gender = 'F';
		s2.branch = "ECE";
		s2.collegeName = "Abbits";
		
		s1.displayStudentDetails();
		System.out.println("  ");
		s2.displayStudentDetails();
	}

}
