package programs_of_exam_Questions;

import java.util.Scanner;

public class LoanManagerMethod {
	
	String customerName;
	int loanAmount;
	double interestRate;
	int timeInYears;
	
	double calculateInterest(int amount,double interestRate,int timeInYears) {
		double rate = (amount * interestRate * timeInYears) / 100;
		return rate;
	}
	double calculateTotalAmount(double rate) {
		double total = loanAmount + rate; 
		return total;
		
	}
	double calculateMonthlyEmi(double total,int timeInYears){
		int month =  timeInYears * 12;
		double emi = total / month; 
		return emi;
	}

	void displayLoanSummary(String customerName,double totalLone,double emi ) {
		System.out.println("customer Name : " + customerName);
		System.out.println("Customer Total Loan Amount : " + totalLone);
		System.out.println("Customer Monthly EMI : " + emi);
	
	}
	
	public static void main(String[] args) {
		
		LoanManagerMethod m1 = new LoanManagerMethod();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the customer Name : ");
		m1.customerName = sc.nextLine();
		
		System.out.println("Enter the loan amount : ");
		m1.loanAmount = sc.nextInt();
		
		System.out.println("enter the Interest Rate :");
		m1.interestRate = sc.nextDouble();
		
		System.out.println("Enter the time In Years :");
		m1.timeInYears = sc.nextInt();
		sc.nextLine();
		
		System.out.println("  ");
		double rate = m1.calculateInterest(m1.loanAmount,m1.interestRate,m1.timeInYears);
		System.out.println("calculated Interest from the Amount : " + rate);
		int total = (int) m1.calculateTotalAmount(rate);
		System.out.println("Calculate totalAmount : " + total);
		double emi = m1.calculateMonthlyEmi(total,m1.timeInYears);
		System.out.printf("EMI needed to monthly : " + "%.2f%n" , emi);
		m1.displayLoanSummary(m1.customerName, total, emi);
		
		
	}

}
