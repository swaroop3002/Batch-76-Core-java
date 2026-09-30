package languagefundamentals;

public class Students {
	int roll_Number;
	int age;
	String sName;
	
//	NO arg constructor
	
	Students() {
		System.out.println("No arg constructor called .....");
		roll_Number = 100;
		sName = "Unknown";
		age = 50;
	}
	
//	Constructor with arguments or parameters
	Students(int roll_Number , int age , String sName){
		System.out.println("Parameterized method called .....");
		this.roll_Number = roll_Number;
		this.sName = sName;
		this.age = age;	
	}

	public static void main(String[] args) {
		System.out.println("Mani method started ......");
		
		Students s1 = new Students();
		
		s1.roll_Number = 100;
		s1.age = 24;
		s1.sName = "Suman";
	    s1.studentInfo();	
	    
	    Students s2 = new Students(102,27,"haritha");
	    s2.studentInfo();
	    
	    Students s3 = new Students(105,30,"Sudhakar");
	    s3.studentInfo();
	}
	
	void studentInfo() {
		System.out.println("Student Name : " + sName);
		System.out.println("Student roll Number : " + roll_Number);
		System.out.println("Student age : " + age);
	}

}
