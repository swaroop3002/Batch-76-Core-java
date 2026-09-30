package com.logical_Statements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
//		System.out.println("Wel come to pooling Booth : ");
		String SN = "";
		do{
			System.out.println("Wel come to pooling Booth : ");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			if(age < 18) {
				System.out.println("You are not eligible for voting : ");
			}else {
	        	System.out.println("Enter your genger (M / F ) : ");
	        	char gender = sc.next().charAt(0);
	        	if(gender !='M' && gender !='F' && gender != 'm' && gender != 'f') {
	        		System.out.println("Not eligible");
	        	}else {
	        		System.out.println("Enter your VoterId number : ");
	        		int voteNo = sc.nextInt();
	        		
	        		System.out.println("\n Candidates : ");
	        		System.out.println("1 Mark Antony");
	        		System.out.println("2 Swaroop ");
	        		System.out.println("3 Minhaz ");
	        		System.out.println("4 Ganesh ");
	        		
	        		System.out.println("Press any one option to vote : ");
	        		int option = sc.nextInt();
	        		switch(option) {
	        		case 1: 
	        			System.out.println("Your vote is captured for Mark Antony : ");
	        			break;
	        		case 2:
	        			System.out.println("Your vote is captured for Swaroop : ");
	        			break;
	        		case 3:
	        			System.out.println("Your vote is captured for Minhaz : ");
	        			break;
	        		case 4: 
	        			System.out.println("Your vote is captured for Ganesh : ");
	        			break;
	        		default:
	        				System.out.println("Thanks for Voting to NOTA : ");
	        		}
	        		System.out.println("Do you want to continue ...? Click S to continue or Click N to No");
	    			SN = sc.next();
	        	}
	        	
	        }

		}while(SN.equalsIgnoreCase("S"));
//		System.out.println("Thank Your for choosing the option to continue : ");
     }

}

