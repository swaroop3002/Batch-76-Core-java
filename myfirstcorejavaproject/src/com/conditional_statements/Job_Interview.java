package com.conditional_statements;

import java.util.Scanner;

public class Job_Interview {

	public static void main(String[] args) {
		System.out.println("An Interview Selection ......");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Hay nice to meet you mr: " + name);
		System.out.println("Enter your Qualification : ");
		String qual = sc.next();
		
		if(qual.equalsIgnoreCase("BTech")) {
			
		System.out.println("Enter Your Percentage : ");
	    double per= sc.nextDouble();
	    if(per >= 75.5) {
	    	System.out.println("nice percentage have a look forword :");
	    	
	    	System.out.println("Enter your coding test score : ");
	    	int score = sc.nextInt();
	    	if(score >= 85 ) {
	    		System.out.println("Enter your communication score : ");
	    		double score1 = sc.nextDouble();
	    		if(score1 >= 70) {
	    			System.out.println(" good to go nice score in communication : ");
	    			System.out.println("Enter your Interview Result Pass or Fail : ");
	    			String result = sc.next();
	    			if(result.equalsIgnoreCase("Pass")) {
	    				System.out.println("Good to say that you are selected our team will update you as soon as possibel : ");
	    				
	    			}else {
	    				System.out.println("on mister " + name + " We will update you shortly :");
	    			}
	    		}else {
	    			System.out.println("You have to improve your communication skills : ");
	    		}
	    	}else {
	    		System.out.println("you have to improve your coding skills and  come again we will catch you : ");
	    	}
	    }else {
	    	System.out.println("your cgpa is not amtched with this Intervied program : ");
	    }
	    
	    }else {
	    	System.out.println("Your qualification is not matched with the job discription : ");
	    }
	}

}
