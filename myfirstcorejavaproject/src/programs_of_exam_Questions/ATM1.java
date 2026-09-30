package programs_of_exam_Questions;

import java.util.Scanner;

public class ATM1 {
	
//	void deposit(int amount){
//		balance = balance + amount;
//		System.out.println(" deposited amount : " + amount);		
//	}
//	
//	void withdraw(int amount){
//		balance = balance - amount;
//		System.out.println("withdraw amount : ");
//		
//		
//	}
//	void checkBalance(){
//		
//	}

    int balance;
	String customerName;
	static String bankName = "State Bank Of India";
	long accountNumber;
	
	public static void main(String[] args) {
//		System.out.println(" main method started .....");
		ATM1 a = new ATM1();
		ATM1 a2 = new ATM1();
		Scanner sc = new Scanner(System.in);
		
		a.balance = 50000;
		a.customerName = "Swaroop";
		a.accountNumber = 93475991532L;
		
		a2.balance = 70000;
		a2.customerName = "haritha";
		a2.accountNumber = 756986828315L;
		System.out.println(" wel come to indian atm Service :  .....");
		
		System.out.println(" enter the deposit amount : ");
		int amount = sc.nextInt();
		a.deposit(amount);
		
		System.out.println("Enter the withdraw amount : " );
		int amount1 = sc.nextInt();
		a.withdraw(amount1);
		
		System.out.println("  ");
		System.out.println("The Second Customer : ");
		
		System.out.println("Enter the deposit amount : ");
		int amount2 = sc.nextInt();
		a2.deposit(amount2);
		
		System.out.println("Enter the withdraw amount : ");
		int amount3 = sc.nextInt();
		a2.withdraw(amount3);
		
	}
	
	void deposit(int amount){
		balance = balance + amount;
		System.out.println(" deposited amount : " + amount);		
		checkBalance();
	}
	
	void withdraw(int amount){
		balance = balance - amount;
		System.out.println("withdraw amount : " + amount);
		checkBalance();
		
		
	}
	void checkBalance(){
		System.out.println("Balanece in account : " + balance);
		
	}
}
