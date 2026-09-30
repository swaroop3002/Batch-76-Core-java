package programs_of_exam_Questions;

// <--- COPYCONSTRUCTOR --->

public class Employee2 {
	int empid;
	String empname;
	String dept;
	
	Employee2(){
		
	}
	
	Employee2(int empid, String empname , String dept){
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
	}

	public static void main(String[] args) {
		Employee2 e = new Employee2();
		System.out.println("main method started : ");
		e.empid = 101;
		e.empname = "Nawaz";
		e.dept = "Agriculture";
		e.getEmpInfo();
		
		
//		e.getEmpInfo();
		Employee2 e1 = e;
		System.out.println(" ");
		e1.getEmpInfo();
	}
	void getEmpInfo() {
		System.out.println("Employee Id : " + empid );
		System.out.println("Employee Name : " + empname);
		System.out.println("Employee Depatement : " + dept);
	}

}
