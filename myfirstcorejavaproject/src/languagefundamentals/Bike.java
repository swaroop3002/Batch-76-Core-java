package languagefundamentals;

public class Bike {
	
	String model;
	String brand;
	float price;
	String colour;
	int milage;
//	int ManifacturedYear;
	
	public Bike(String model,String brand){
		this(model,brand,100000);
		
		System.out.println("2- arg constructor called.....");
		
	}
	public Bike(String model, String brand, float price) {
	this(model,brand,price,"black");
//	System.out.println("3 - arg constructor called : ");
	}

	public Bike(String model, String brand, float price, String colour) {
	this(model,brand,price,colour,35);
	}

	public Bike(String model, String brand, float price, String colour, int milage) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.milage = milage;
	}



	public static void main(String[] args) {
		System.out.println("main method started ......");
		Bike b1 = new Bike("classic","royalenfeild");
		b1.bikeInfo();
		System.out.println(" ");
		System.out.println("3 - arg constructor called : ");
		Bike b2 = new Bike("mt15","Yamaha",250000,"Black");
		b2.bikeInfo();
		
		System.out.println(" ");

		System.out.println("4 - arg constructor called : ");
		Bike b3 = new Bike("CT100","Bajaj",100000,"Blue",90);
		b3.bikeInfo();
		

		
	}
	
	void bikeInfo() {
		System.out.println("Bike Model : " + model);
		System.out.println("Bike Brand : " + brand);
		System.out.println("Bike Price : " + price);
		System.out.println("Bike Color : " + colour);
		System.out.println("Bike Milage : " + milage);
//		System.out.println("Bike Manifactured Date : " + ManifacturedYear);
	}

}
