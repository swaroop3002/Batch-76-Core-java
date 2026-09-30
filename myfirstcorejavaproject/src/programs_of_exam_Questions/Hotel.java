package programs_of_exam_Questions;

import java.util.Scanner;

public class Hotel {
	String roomType;
	int noOfDays;
	double price;
	double foodCharges;
	double roomCost;
	double finalBill;
	
	Scanner sc = new Scanner(System.in);
	
	Hotel(){
		
	}
	Hotel(String roomType){
		this();
		this.roomType = roomType;
	}
	Hotel(String roomType,int noOfDays){
		this(roomType);
		this.roomType = roomType;
		this.noOfDays = noOfDays;
	}
	Hotel(String roomType ,int noOfDays,double price){
		this(roomType,noOfDays);
		this.roomType = roomType;
		this.noOfDays = noOfDays;
		this.price = price;
	}
	Hotel(String roomType,int noOfDays,double price ,double foodCharges){
		this(roomType ,noOfDays,price);
		this.roomType = roomType;
		this.noOfDays = noOfDays;
		this.price = price;
		this.foodCharges = foodCharges;
		
		roomCost = price * noOfDays;
		finalBill = roomCost + foodCharges;
	}

	public static void main(String[] args) {
		System.out.println("Wel come to Hotel Taj ......");
		Hotel h = new Hotel("Dulex" , 3, 2000.5, 1200.5);
		h.hotelBill();	
	}
	
	void hotelBill() {
		
		System.out.println("Hotel Room Type : " + roomType);
		System.out.println("No Of Days : " + noOfDays);
		System.out.println("room price per day : " + price +" $ ");
		System.out.println("Food Charges : " + foodCharges +" $ ");
		System.out.println("Room cost : " + roomCost +" $ ");
		System.out.println("Finall Bill of the Customer : " + finalBill +" $ ");
		
	}

}
