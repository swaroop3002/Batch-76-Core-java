package com.constructors;

// constructor chaining 

public class Car {
	String name;
	int price;
	String model;
	int quantity;
	double finalBill;
    static double tax = 50000;
	
	Car(){
		System.out.println("No arg constructor called : ");
	}
	Car(String name){
		this();
		this.name = name;
	}
	Car(String name ,int price){
		this(name);
		this.price = price;	
		System.out.println("2 arg constructor called : ");
	}
	Car(String name, int price ,String model){
		this(name,price);
		this.model = model;
		System.out.println("3 arg constructor called : ");
	}
	Car(String name, int price, String model,int quantity){
		this(name,price,model);
		this.quantity = quantity;
		
		tax = price + tax ;
		finalBill = tax * quantity;
		
		
	}
	public static void main(String[] args) {
		System.out.println("main method started : ");
//		Car c = new Car();
		Car c1 = new Car("toyota" ,1500000 ,"Glanza",2);
		c1.getCarInfo();
		

	}
	void getCarInfo() {
		System.out.println("Name of the car : " + name);
		System.out.println("price of the car : " + price);
		System.out.println("model of the car : " + model);
		System.out.println("quantity of the car : " + quantity);
		System.out.println("tax of the car : " + tax);
		System.out.println("finalBill of the car : " + finalBill);
	}

}
