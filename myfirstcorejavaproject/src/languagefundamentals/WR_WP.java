package languagefundamentals;

import java.util.Scanner;

public class WR_WP {

	int balance = 100000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		WR_WP wp = new WR_WP();
		System.out.println(" wel come to bank of baroda .....");

		System.out.println("enter the amount paying : ");
		int amount = sc.nextInt();
		wp.loanAmountEmi(amount);

		System.out.println("Enter the deposit amount : ");
		int amount1 = sc.nextInt();
		wp.deposit(amount1);

	}

	int loanAmountEmi(int amount) {
		balance = balance - amount;
		System.out.println("Paid amount : " + amount);

		System.out.println("Balance amount to Pay : " + balance);
		return amount;
	}

	int deposit(int amount) {
		balance = balance + amount;
		System.out.println(" Deposit amount : " + amount);

		System.out.println("Balance amount to Pay : " + balance);

		return amount;

	}

	void showTotalBalance() {
		System.out.println("Total balance : " + balance);
	}

}
