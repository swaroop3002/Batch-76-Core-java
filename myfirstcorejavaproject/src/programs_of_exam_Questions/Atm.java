package programs_of_exam_Questions;

import java.util.Scanner;

public class Atm {
	double accountBalance = 20000;
	long accountNumber = 2548785652L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Atm a1 = new Atm();
		
		a1.showBalance();
		System.out.println("Enter the deposit amount : " );
		double money = sc.nextDouble();
		a1.deposit(money);
        
		System.out.println("Enter the withdraw amount : ");
		double money1 = sc.nextDouble();
		a1.withdraw(money1);
	}

	
	void deposit(double money) {
		accountBalance = accountBalance + money;
		System.out.println("Deposit amount : " + money);
		showBalance();
		
		
	}
	void withdraw(double money) {
		
		accountBalance = accountBalance - money;
		System.out.println("Withdraw amount : " + money);
		showBalance();
	}
		

    void showBalance() {
		System.out.println("Available Balance : " + accountBalance);
	}
}
