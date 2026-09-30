package programs_of_exam_Questions;

import java.util.Scanner;

public class Bank1 {
	
	double balance = 10000;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bank1 a = new Bank1(); 
		

//		a.showBalance();
		System.out.println("Wel come to Indian Bank ...");
		a.showBalance();
		
		System.out.println("Enter the deposit amount : " );
		double amount = sc.nextDouble();
		a.deposit(amount);	
		
		System.out.println("Enter withdraw amoutn : ");
		double amount1 = sc.nextDouble();
		a.withdraw(amount1);
//		
//		a.deposit(amount);
//		a.withdraw(amount);
//		a.showBalance();
	}
	
	
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("deposit amount : " + amount);
		showBalance();
		
		
	}
	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("withdraw amount : " + amount);
		showBalance();
	}
	
	void showBalance() {
		
		System.out.println("The available balance : " + balance);
	}

}
