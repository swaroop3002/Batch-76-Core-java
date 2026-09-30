package languagefundamentals;

public class Car {
	String model;
	String brand;
	double price;
	String colour;
	int milage;
	Car(){
		System.out.println("NO arg is called : ");
	}
	Car(String model,String brand){
		this.model = model;
		this.brand = brand;
	}
	Car(String model,String brand,double price){
		this.model = model;
		this.brand = brand;
		this.price = price;
		
	}
	Car(String model,String brand,int price,String colour){
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	Car(String model,String brand,int price,String colour,int milage){
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.milage = milage;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Wel come to TrueValue ......");
//		c1.name = "seltos";
//		c1.brand = "KIA";
//		c1.price = 150000;
//		c1.colour = "black";
//		c1.milage = 15;
//		c1.carDetails();
		Car c1 =new Car("seltos","KIA");
		c1.carDetails();
		
		Car c2 = new Car("nexon","Tata",1200000);
		c2.carDetails();
		
		Car c3 = new Car("Punch","Tata",1500000,"Balack");
		c3.carDetails();
		
		Car c4 = new Car("Harrieer","Tata",2000000,"gray",13);
		c4.carDetails();
	}
	void carDetails() {
		System.out.println("car name : " + model);
		System.out.println("car Brand : " +  brand);
		System.out.println("car price : " + price);
		System.out.println("car colour : " +  colour);
		System.out.println("car milage : " +  milage);
	}

}
