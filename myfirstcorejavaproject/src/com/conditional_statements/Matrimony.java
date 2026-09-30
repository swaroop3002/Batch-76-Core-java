package com.conditional_statements;

// Nested Conditions .....
import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wel come to telugu shadi.com 🤝");
		
		System.out.println("Enter your FullName : ");
		String fullname = sc.nextLine();
		System.out.println("Hi mr : " + fullname + " , nice to meet you ");
		
		System.out.println("can you please enter your assets : ");
		int assets = sc.nextInt();
		
		System.out.println("can you please enter your monthly salary : ");
		double salary = sc.nextDouble();
		
		if(assets >= 20000000 && salary >= 100000) {
			System.out.println("Oh! nice good to go lets continue the conversation : ");
			
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			if(age >= 19 && age <= 26) {
				System.out.println("Your age is matched with the profile : ");
				
				System.out.println("Enter your height : ");
				double height = sc.nextDouble();
				if(height >= 5.2 && height <= 5.6) {
					System.out.println("Oh! thst's pretty nice .");
					
					System.out.println("Enter your weight : ");
					double weight = sc.nextDouble();
					if(weight >= 70 && weight <=80) {
						System.out.println("Thet's good it very happpy to hear that : ");
						
						System.out.println("Is you have any political backgroung : ");
						boolean poli = sc.hasNextBoolean();
						if(!poli) {
							System.out.println("Yes we have : ");
						}else {
							System.out.println("Oh that's good you are matched with the profile out team will contact you as soon as possible and share the Bride details : ");
							System.out.println("Thank you for visiting telugu shadi.com have a nice day :  ");
						}
					}else {
						System.out.println("Go to gym and get back to us man .");
					}
				}else {
					System.out.println("The height is not matched for this profile : ");
				}
			}else {
				System.out.println("You are not matched with the required age for this profile : ");
			}
		}else {
			System.out.println("Your are not matched for the profile : ");
		}
		
	}

}
