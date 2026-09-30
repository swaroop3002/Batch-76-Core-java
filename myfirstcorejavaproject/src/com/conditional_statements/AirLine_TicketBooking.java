package com.conditional_statements;

import java.util.Scanner;

public class AirLine_TicketBooking {

	public static void main(String[] args) {
		System.out.println("Wel come to Indian Air Lines : ");
		Scanner sc= new Scanner(System.in);
		
		int ticketTax =500;
		int finalTicketAmount = 0;
		
		System.out.println("Enter your destination : ");
		String destination = sc.next();
		if(destination.equalsIgnoreCase("Australia")) {
			System.out.println("The flight is availabel : ");
			
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			if(age  >= 20) {
				System.out.println("Your are eligible for the flight : ");
				System.out.println("Enter your seat type FirstClass or SecondClass : ");
				String seat= sc.next();
				switch(seat) {
				case "FirstClass" -> {
					System.out.println("Your seat type is first class : ");
					int seatPrice = 10000;
					finalTicketAmount = ticketTax + seatPrice;
					System.out.println("The Price of the first class per seat is " + seatPrice);
					System.out.println("total Ticket amount including Tax is " + finalTicketAmount);

				}
				case "SecondClass" ->{
					System.out.println("Your seat type is second Class : ");
					int seatPrice1 = 7000;
					finalTicketAmount = ticketTax + seatPrice1;
					
					System.out.println("The price of the second class per seat is : " + seatPrice1);
					System.out.println("total Ticket amount including Tax is " + finalTicketAmount);

				}
				default -> System.out.println("Entered seat type is no available : ");
				}
				
				System.out.println("Check your baggage it is Checked or not : ");
				String baggage = sc.next();
				if(baggage.equalsIgnoreCase("Checked")) {
					System.out.println("Your baggage is checked it is clear Have a safe journey : ");
					
				}else {
					System.out.println("Your baggage is not checked you are not allowed to move in the flight :  ");
				}
				
			}else {
				System.out.println("your age is not eligible to travel in this airline : ");
			}
		}else {
			System.out.println("The flight is currontly not available : ");
		}

	}

}
