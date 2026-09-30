package programs_of_exam_Questions;

import java.util.Scanner;

public class Bank {

	double balance = 10000.0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Bank a= new Bank();
		a.showbalance();

		System.out.println("Enter the deposit :");
		double amount = sc.nextDouble();
		a.deposit(amount);

		System.out.println("Enter the withdraw:");
		double amount1 = sc.nextDouble();

		a.withdraw(amount1);

	}

	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit amount:" + amount);
		showbalance();
	}

	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdraw amount:" + amount);
		showbalance();
	}

	void showbalance() {
		System.out.println("Balance in the account:" + balance);
//		System.out.println("Thank You Visit Again !!");
	}

}