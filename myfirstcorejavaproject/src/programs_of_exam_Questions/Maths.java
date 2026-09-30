package programs_of_exam_Questions;

public class Maths {

	void addition(int a ,int b) {
		
		
		int sum = a+b;
		System.out.println(sum);
		
		
	}
	void substraction(int a , int b) {
		int difference = a-b;
		System.out.println(difference);
		
	}
	void multiplication(int a , int b) {
		int product = a*b;
		System.out.println(product);
	}
	void division(int a , int b) {
		int sum = a/b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Maths m1 =  new Maths();
		System.out.println(" wel come to maths class...");
		m1.addition(20 , 30);
		m1.substraction(100,20);
		m1.multiplication(50,10);
		m1.division(9,3);
		

	}

}
