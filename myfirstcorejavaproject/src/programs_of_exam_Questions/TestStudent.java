//Calling the methods without creating an objects in the main method and class level too

package programs_of_exam_Questions;

public class TestStudent {
	
	
//	TestStudent s1 = new TestStudent();
	static int data;
	
	static {
		TestStudent s1 = new TestStudent();
		
		s1.hi();
		s1.hello();
		s1.welCome();
	}
	
	void hi() {
		System.out.println("Hi,");
	
	}
	
	void hello() {
		System.out.println("Student...");
	}
	
	void welCome() {
		System.out.println("Wel come to VCube Software Solutions");
	}
	public static void main(String[] args) {
		System.out.println(data);
	}

}
