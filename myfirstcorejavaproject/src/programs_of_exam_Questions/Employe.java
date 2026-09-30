package programs_of_exam_Questions;

public class Employe {

//	6814
	String ename;
	int eId;
	String dept;
	int sal;
	String experience;
	static String companyName = "Amazon";
	
	void EmployeeName() {
		System.out.println("Employee Name : " + ename);
	}

//	  I Have to create individual objects for each emp details
	void employeeId(){
		System.out.println("Employee Id : " + eId);

	}
	void employeeDept() {
		System.out.println("Employee dept : " + dept);

	}
	void employeeSalary() {
		System.out.println("Employee sal : " + sal);

	}
	void employeeExperience() {
		System.out.println("Employee experience : " + experience);

	}
	void employeeCompanyName() {
		System.out.println("company Name : " + companyName);

	}

	public static void main(String[] args) {
		
		Employe e1 = new Employe();
		e1.ename="Swaroop";
		e1.eId = 001;
		e1.dept ="Java fullstack developer";
		e1.sal= 1000000;
		e1.experience = "2+ Years";
		
		e1.EmployeeName();
		e1.employeeId();
		e1.employeeDept();
		e1.employeeSalary();
		e1.employeeExperience();
		System.out.println("Company Name : " + companyName);

	}

}
