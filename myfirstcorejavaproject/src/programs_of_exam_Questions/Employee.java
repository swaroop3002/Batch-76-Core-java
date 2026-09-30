package programs_of_exam_Questions;

public class Employee {

	int empid;
	String empName;
	float salary;
	String experience;
	char grade;
	String permanentStatus;
	
	void displayEmployesDetails(){
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Employee Experience: " + experience);
		System.out.println("Employee Grade: " + grade);
		System.out.println("Employee PermanentStatus: " + permanentStatus);

	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.empid=01;
		e1.empName = "Swaroop";
		e1.salary = 30000.50f;
		e1.experience = "5 years";
		e1.grade = 'A';
		e1.permanentStatus = "temperary";
		
		e2.empid=02;
		e2.empName = "SAM";
		e2.salary = 50000.1f;
		e2.experience = "8 years";
		e2.grade = 'B';
		e2.permanentStatus = "Parmanent";
		
		e3.empid=03;
		e3.empName = "Mahesh";
		e3.salary = 60000.22f;
		e3.experience = "10 years";
		e3.grade = 'O';
		e3.permanentStatus = "Parmanent";
		
		e1.displayEmployesDetails();
		
		System.out.println(" ");
		e2.displayEmployesDetails();
		System.out.println(" ");
		e3.displayEmployesDetails();

	}

}
