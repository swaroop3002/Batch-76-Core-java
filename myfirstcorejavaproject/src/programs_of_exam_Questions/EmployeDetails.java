package programs_of_exam_Questions;
import java.math.BigInteger;
import java.math.BigDecimal;
public class EmployeDetails {

	String empName;
	int empId;
	int age;
	int joiningYear;
	String dept;
	long mobileNumber;
	int salary;
	float bonus;
	String experience;
	boolean empStatus;
	char grade;
	
	void displayEmployeeDetails() {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Age : " + age);
		System.out.println("Employee Joining Year : " + joiningYear);
		System.out.println("Employee Department Number : " + dept);
		System.out.println("Employee Mobile Number : " + mobileNumber);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee Bonus : " + bonus);
		System.out.println("Employee Experience : " + experience);
		System.out.println("Employee Status : " + empStatus);
		System.out.println("Employee Grade : " + grade);
		
	}
	
	public static void main(String[] args) {
		
		EmployeDetails e1 = new EmployeDetails();
//		BigInteger bi = new BigInteger("2345671234567789789");
//		BigDecimal bd = new BigDecimal("234564321234567.09876567890");
		
		e1.empName = "Swaroop";
		e1.empId = 123321213;
		e1.age = 23;
		e1.joiningYear = 2026;
		e1.dept = "IT Department";
		e1.mobileNumber = 9347599153L;
		e1.salary = 200000;
		e1.bonus = 20055.22f;
		e1.experience = "10+ years";
		e1.empStatus = true;
		e1.grade = 'A';
		
		e1.displayEmployeeDetails();
		
		

	}

}
