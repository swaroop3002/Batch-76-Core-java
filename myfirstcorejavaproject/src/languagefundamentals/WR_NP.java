package languagefundamentals;

import java.util.Scanner;

// with return + not parameter
public class WR_NP {
	Scanner sc = new Scanner(System.in);
	
	
	double getBasicSalary() {
		
		System.out.println("Enter your Basic salary : " );
		double sal = sc.nextDouble();
		return sal;
	}

	int getHouseRent() {
		
		System.out.println(" Enter your house rent : ");
		int HR = sc.nextInt();
		return HR;
	}
	
	float getCarMaintanence() {
		System.out.println("Enter your car maintanence : ");
		float CM = sc.nextFloat();
		return CM;
	}
	void main(String[] args) {

		System.out.println(" Salary and Monthly Expences : .....");
		double sal = getBasicSalary();
		int HR = getHouseRent();
		float CM = getCarMaintanence();
		
		
//		System.out.println( " total monthly expences : " + sal + HR + CM);
		System.out.println( " total monthly expences : " +  ( HR + CM));
		System.out.println(" The remaining amount : " + (sal - (HR + CM)));
	}

}
