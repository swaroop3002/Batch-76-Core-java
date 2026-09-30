package languagefundamentals;

import java.util.Scanner;

public class WR_NP11 {
	
	int getHomeRent() {
		System.out.println("the house rent : ");
		int hr = sc.nextInt();
		return hr;
	}
	float gerSalary() {
		System.out.println("salary : ");
		float sal = sc.nextFloat();
		return sal;
	}
	double carRent() {
		System.out.println("car rent for one day : ");
		double cr = sc.nextDouble();
		return cr;
	}
	int landLineNo() {
		System.out.println("Enter the landLine number : ");
		int lln = sc.nextInt();
		return lln;
	}
	byte age() {
		System.out.println("Enter the age : ");
		byte a = sc.nextByte();
		return a;
	}
	short luckyNumber() {
		System.out.println("Enter your lucky number : ");
		short ln = sc.nextShort();
		return ln;
	}
	long accountNumber() {
		System.out.println("Enter Your account number : ");
		long ac = sc.nextLong();
		return ac;
	}
	String gender() {
		System.out.println("Enter Your gender < M , F > : ");
		String g1 = sc.next();
		return g1;
	}
	boolean isHostelFoodIsGood() {
		System.out.println("if Yes or No : ");
		boolean bo = sc.nextBoolean();
		return bo;
				
	}

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	    WR_NP11 np= new WR_NP11();
	    
	    System.out.println("main methos started : ");
	    
	    np.getHomeRent();	
//	    gerSalary();
//	    carRent();
//	    landLineNo();
//	    age();
//	    luckyNumber();
//	    accountNumber();
//	    gender();
//	    isHostelFoodIsGood();

	    System.out.println("main method ended : ");
	
	}
	
//	int getHomeRent() {
//		System.out.println("the house rent : ");
//		int hr = sc.nextInt();
//		return hr;
//	}
//	float gerSalary() {
//		System.out.println("salary : ");
//		float sal = sc.nextFloat();
//		return sal;
//	}
//	double carRent() {
//		System.out.println("car rent for one day : ");
//		double cr = sc.nextDouble();
//		return cr;
//	}
//	int landLineNo() {
//		System.out.println("Enter the landLine number : ");
//		int lln = sc.nextInt();
//		return lln;
//	}
//	byte age() {
//		System.out.println("Enter the age : ");
//		byte a = sc.nextByte();
//		return a;
//	}
//	short luckyNumber() {
//		System.out.println("Enter your lucky number : ");
//		short ln = sc.nextShort();
//		return ln;
//	}
//	long accountNumber() {
//		System.out.println("Enter Your account number : ");
//		long ac = sc.nextLong();
//		return ac;
//	}
//	String gender() {
//		System.out.println("Enter Your gender < M , F > : ");
//		String g1 = sc.next();
//		return g1;
//	}
//	boolean isHostelFoodIsGood() {
//		System.out.println("if Yes or No : ");
//		boolean boo = false;
//		boolean boo1 = sc.nextBoolean();
//		return boo;
//				
//	}
	
}
