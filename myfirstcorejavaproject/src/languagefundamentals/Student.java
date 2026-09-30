package languagefundamentals;

public class Student {
	
//	var method level key word
	void display() {
		var age = 20;
		var name = "Swaroop";
		var salary = 100000;
		System.out.println(age);
		System.out.println(name);

		System.out.println(salary);

	}
//   enum in class level keyword
	enum Day{
		mon,tues,wed,thur,fri,sat,sun, Student;
	}
	
	
	public static void main(String[] args) {
		
		Day d1 = Day.wed;
		System.out.println(d1);
		
//		instance of 
		int i = 10;
//		System.out.println(i instanceof Integer);
//		System.out.println(i instanceof Number);

		Student s = new Student();
		System.out.println(s instanceof Student);
		s.display();
		
	}
}
