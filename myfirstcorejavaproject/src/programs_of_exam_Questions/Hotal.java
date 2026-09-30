package programs_of_exam_Questions;

import java.util.Scanner;

public class Hotal {

//	Scanner sc = new Scanner(System.in);
	String roomType;
	int noOfDays;
	int roomPrice;
	int foodCharges;
	int roomCost;
	int finalBill;

	Hotal() {

	}

	Hotal(String roomType) {
		this();
		this.roomType = roomType;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Hotal h = new Hotal();
		System.out.println("Wel come to Hotel Taj .......");

		System.out.println("Enter the Hotal type : ");
		h.roomType = sc.next();
		System.out.println(" ");
		System.out.println("Enter the number of days : ");
		h.noOfDays = sc.nextInt();
		System.out.println(" ");

		System.out.println("Enter the room Price per day : ");
		h.roomPrice = sc.nextInt();
		System.out.println(" ");
		System.out.println("Enter the food Charges : ");
		h.foodCharges = sc.nextInt();	
		
//	    int RoomCost = h.roomPrice * h.noOfDays;
//	    System.out.println("Room Cost : "  + RoomCost);
//	    
//	    int FinalBill = RoomCost + h.foodCharges;
//	    System.out.println("Final Bill of the customer : " + FinalBill);
		
		h.roomCost = h.roomPrice * h.noOfDays;
		h.finalBill = h.roomCost + h.foodCharges;
	    
	    System.out.println(" ");
	    
	    System.out.println("Taj Hotel :  ");
	    h.getCustomerBill();
	    System.out.println("ThankYou For Visiting Have a Nice Day");
	    
		
//		h.getCustomerBill();
	}

	void getCustomerBill() {
		System.out.println("Room Type : " + roomType);
		System.out.println("Price of the Room : " + roomPrice);
		System.out.println("No of days : " + noOfDays);
		System.out.println("Room Cost : " + roomCost);
		System.out.println("food charges : " + foodCharges);
		System.out.println("Final Bill : " + finalBill);
	}

}
