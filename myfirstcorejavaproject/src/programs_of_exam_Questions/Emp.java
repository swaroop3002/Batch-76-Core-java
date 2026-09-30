package programs_of_exam_Questions;

public class Emp {
	String EmpName;
	double salary;
	String companyName;
	String getempname() {
		return "Swaroop";
	}
	double sal() {
		return 100000;
	}
	String cname() {
		return "Deloitt";
	}

	public static void main(String[] args) {
		Emp e = new Emp();
		//To get the default values
		System.out.println("Name of the employee : " + e.EmpName);
		System.out.println("Employee salary : " + e.salary);
		System.out.println("Emp company Name : " + e.companyName);
		
		System.out.println(" ");
		// To get the assigned values
		
		System.out.println("Name of the employee : " + e.getempname());
		System.out.println("Employee salary : " + e.sal());
		System.out.println("Emp company Name : " + e.cname());
		

	}

}
