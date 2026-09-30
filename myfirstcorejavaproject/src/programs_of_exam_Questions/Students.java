package programs_of_exam_Questions;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Students {
	
//	BigInteger studentId;
//	BigDecimal fee Paid
	
	String studentName;
	int studentAge;
	int admissionNumber;
	int rollNumber;
	long mobileNumber;
	double AttendencePercentage;
	float totalFees;
	String grade;
	String PassFailStatus;
	
	void displayStudentDetails() {
		System.out.println(studentName);
		System.out.println(studentAge);
		System.out.println(admissionNumber);
		System.out.println(rollNumber);
		System.out.println(mobileNumber);
		System.out.println(AttendencePercentage);
		System.out.println(totalFees);
		System.out.println(grade);
		System.out.println(PassFailStatus);
		
	}
	public static void main(String[] args) {
		Students s1 = new Students();

	
		BigInteger bi = new BigInteger( "12345432132145");
		BigDecimal bd = new BigDecimal("934569.3456");
		
		s1.studentName = "Swaroop";
		s1.studentAge = 23;
		s1.admissionNumber = 185;
		s1.rollNumber = 22416744;
		s1.mobileNumber = 9347599150L;
		s1.totalFees = 1000000f;
		s1.AttendencePercentage = 75;
		s1.grade = "M";
		s1.PassFailStatus = "Pass";
		
		s1.displayStudentDetails();
		System.out.println("addmission Number : " + bi);
		System.out.println("Fee Paid : " + bd);
		System.out.println(" added two BigIntegers: " + bi.add(new BigInteger("12345678905612345678912345678")));
		
//	    Another method for adding two BigIntegers [when we take two bigIntegers in different lines] 
//		System.out.println(b1.add(b2));
		
		System.out.println((" added two BigDecimals: " + bd.add(new BigDecimal("12345678.12345678"))));
		
//	    Another method for adding two BigDecimals [when we take two bigIntegers in different lines] 
//		System.out.println(b1.add(b2));
		
		
	}

}
