package languagefundamentals;

import java.util.Scanner;

public class Bank {

	double balance = 10000d;

	void main(String[] args) {

		Bank b1 = new Bank();

		System.out.println("Wel come to banck of India");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deposit amoutn : ");
		double amount = sc.nextDouble();
		b1.showBalance();
		
		


	}

	void Deposite(double amount) {
		balance = balance + amount;
		System.out.println("Deposite amount : " + amount);//2000
		showBalance();
	}

	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdraw amount : " + amount);
		showBalance();
	}

	void showBalance() {
		System.out.println("Availabel Balance : " + balance);
		System.out.println("Thank you for vistiting .....");
//		showBalance();
	}

}



























//showBalance();
//System.out.println("enter the deposite amount: ");
//double amount = sc.nextDouble();
//b1.Deposite(amount);
//
////showBalance();
//System.out.println("enter withdraw amount : " );
//double amount1 = sc.nextDouble();
//withdraw(amount);

