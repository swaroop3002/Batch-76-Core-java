package programs_of_exam_Questions;

import java.util.Scanner;

public class LoanManager {

	String customerName;
	int loanAmount;
	int interestRate;
	int Loantenure;

	double calculateInterest(double interest) {

		loanAmount = (loanAmount * interestRate * Loantenure) / 100;
		System.out.println("Intrest : " + interest);
		return interest;

	}

	double calculateTotalAmount(int Totalamount) {
		loanAmount = loanAmount + interestRate;
		System.out.println("total amount : " + Totalamount);

//		System.out.println("Total amount : " + loanAmount);
		return Totalamount;
	}

	double calculateMonthlyEMI(int amount) {
		int months = Loantenure * 12;
		int emi = loanAmount / months;
		System.out.println("monthly EMI : " + emi);
		return emi;
	}

	void displayLoanSummary() {
		System.out.println("THE LOAN SUMMARY ......");
		System.out.println("Customer name : " + customerName);
		System.out.println("Loan amount : " + loanAmount);
		System.out.println("Interest Rate : " + interestRate + " : %");
		System.out.println("Loan Tenure : " + Loantenure);
//		System.out.println("Loan Tenure : " + Totalamount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoanManager m1 = new LoanManager();
		LoanManager m2 = new LoanManager();

		m1.customerName = " Swaroop";
		m1.loanAmount = 80000;
		m1.interestRate = 8;
		m1.Loantenure = 5;

		m2.customerName = "Vinod";
		m2.loanAmount = 50000;
		m2.interestRate = 7;
		m2.Loantenure = 6;

		System.out.println(" main method started .....");
//		m1.calculateInterest(interest);
		m1.displayLoanSummary();
	}
}
