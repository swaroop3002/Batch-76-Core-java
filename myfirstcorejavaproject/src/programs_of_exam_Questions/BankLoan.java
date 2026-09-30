package programs_of_exam_Questions;

import java.util.Scanner;

public class BankLoan{
	String customerName;
	int loanAmount;
	int  paidAmount;
	

	public static void main(String[] args) {
		BankLoan b1 = new BankLoan();
		Scanner sc = new Scanner(System.in);

		
		b1.customerName = "Swaroop";
		b1.loanAmount = 50000;
		b1.paidAmount = 0;
		b1.showLoanDetails();
		
		System.out.println("Enter the paying EMI amount : ");
		int amount = sc.nextInt();
		b1.payLoan(amount);
		
		System.out.println("Amount Paid : " + amount);
		
		System.out.println("Enter the paying second EMI amount : ");
		int amount1 = sc.nextInt();
		b1.payLoan(amount);
		System.out.println("Amount Paid : " + amount1);
		
		System.out.println(" Total Amount Paid : " + (amount + amount1));
		
		System.out.println(" ");
		b1.showRemainingLoan();
		

		
    }
	
    void showLoanDetails() {
    	System.out.println(" The Loan Details .....");
    	System.out.println("Customer Name : " + customerName);
    	System.out.println("Total loan amount : " + loanAmount);
    	System.out.println("Paid amount : " + paidAmount);
		
	}
	void payLoan(int amount) {
		loanAmount = loanAmount - amount;
//		System.out.println("Amount Paid : " + amount);
		System.out.println("Balance amount : " + loanAmount);
		
		
	}
	
	void showRemainingLoan() {
//		System.out.println("RemainingLoan : " +(loanAmount - (b1.amount + b1.amount1)));

		loanAmount = loanAmount + paidAmount;
		System.out.println("Remaining Loan Amount : " + loanAmount);
	}

	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.println(" Wel come to Bank of India : ......");
//	
//	System.out.println("enter the amount paying now : ");
//	
//	double amount = sc.nextDouble();
//	b1.payLoan(amount);
//	
//	System.out.println("The amount Paid : " + amount);
//	
//	System.out.println(" ");
//	
//	b1.showRemainingLoan(amount);
//	System.out.println(" ");
//	
//	System.out.println(" Loan Details ");
//	b1.showLoanDetails(amount);
//
//}
//void payLoan(double amount){
//	balance = balance - amount;
////	System.out.println("the loan paid : " + balance);
//	
//	
//}
//void showRemainingLoan(double amount){
//	
////	System.out.println("the loan paid : " + balance);
//	System.out.println("The balance amount : " + balance);
//	
//	
//}
//void showLoanDetails(double amount){
//	System.out.println("The loan amount they paid : " + amount);
//	System.out.println("The balance they have to pay : " + balance);
//	System.out.println("Thank You for visiting Have a nice day ......");
//	
//	
