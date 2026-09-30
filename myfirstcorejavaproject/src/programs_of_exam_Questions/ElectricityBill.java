package programs_of_exam_Questions;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		
		System.out.println("wel come to SPDL electrical : ");
        Scanner sc = new Scanner(System.in);
        
//        double RatePerUnit = 0;
//        double UnitsConsumed = 0;
//        double TotalElectricityBill = 0;
        
		System.out.println("Enter your connection type : ");
		String conn = sc.next();
		switch(conn) {
		case "Domestic" ->{
			System.out.println("Enter no of units are consumed : ");
			int units = sc.nextInt();
			if(units <= 100) {
				System.out.println("The charge is per unit : 2 rupies ");
				double rate = 2.0;
				System.out.println("Connection Type is Domestic : " );
				System.out.println("Units consumed : " + units);
				System.out.println("rate per unit is : " + rate);
				System.out.println("Total electricity bill is : " + (rate = rate * units));

			}else {
				double rate = 3.0;
				System.out.println("Connection Type is Domestic : " );
				System.out.println("Units consumed : " + units);
				System.out.println("rate per unit is : " + rate);
				System.out.println("Total electricity bill is : " + (rate = rate * units));

//				System.out.println("bill for >= 300 units : " + (rate = rate * units));
			}
			break;
		}
		case "Commercial" ->{
			System.out.println("Enter no of units comsumed :");
			int units = sc.nextInt();
			if(units <= 100) {
				double rate = 4;
				System.out.println("Connection Type is Commercial : " );
				System.out.println("Units consumed : " + units);
				System.out.println("rate per unit is : " + rate);
				System.out.println("Total electricity bill is : " + (rate = rate * units));

//				System.out.println("bill for <= 100 units : " + (rate = rate * units));
			}else {
				double rate3 = 8;
				System.out.println("Connection Type is Commercial : " );
				System.out.println("Units consumed : " + units);
				System.out.println("rate per unit is : " + rate3);
				System.out.println("Total electricity bill is : " + (rate3 = rate3 * units));

//				System.out.println("bill for >= 300 units : " + (rate3 = rate3 * units));
			}	
		}
		default -> System.out.println("Entered connecton is not available : ");
		}
		
		
    }
}
