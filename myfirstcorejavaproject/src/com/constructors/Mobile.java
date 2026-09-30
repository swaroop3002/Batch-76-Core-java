package com.constructors;

public class Mobile {
	String model;
	int quantity;
	double price;
	int deliveryCharge;
	double mobileCost;
	double finalBill;
	
	Mobile(){
		
	}
	Mobile(String model){
		this();
		this.model = model;
	}
	
	Mobile(String model ,int quantity){
		this(model);
		this.quantity = quantity;
	}
	
	Mobile(String model , int quantity,double price){
		this(model,quantity);
		this.price = price;
		
	}
	Mobile(String model ,int quantity ,double price, int deliveryCharge){
		this(model,quantity,price);
		this.deliveryCharge = deliveryCharge;
		
		mobileCost = price * quantity;
		finalBill = mobileCost + deliveryCharge;
		
		
	}
	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println("Wel come to Sangeetha mobiles : ");
		Mobile m1 = new Mobile("VIVO " ,2 , 30000D , 400);
		m1.mobileInfo();
		
	}
	
	void mobileInfo() {
		System.out.println("Model of the mobile : " + model);
		System.out.println("quntity of the mobile : " + quantity);
		System.out.println("price of the mobile : " + price);
		System.out.println("deliceryCharge of the mobile : " + deliveryCharge);
		System.out.println("Cost of the mobiles : " + mobileCost);
		System.out.println("final Bill of the mobile : " + finalBill);
	}

}
