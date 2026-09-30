package languagefundamentals;

public class Mobile {
	

	String mobBrand;
	String mobModel;
	int mobPrice;
	String mobRam;
	
	void displayMobileDetails() {
		System.out.println(mobBrand);
		System.out.println(mobModel);
		System.out.println(mobPrice);
		System.out.println(mobRam);
		
	}
	
	static void displayIntrenalDetails(){
		
		System.out.println();
		
	}
	
	
	{
		
	}

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();
		
		m1.mobBrand = "apple";
		m1.mobModel = "Iphone 13";
		m1.mobPrice = 32000;
		m1.mobRam = "256GB";
		
		m2.mobBrand = "apple";
		m2.mobModel = "Iphone 14";
		m2.mobPrice = 67000;
		m2.mobRam = "256GB";		
		
		m3.mobBrand = "apple";
		m3.mobModel = "Iphone 15pro max";
		m3.mobPrice = 125000;
		m3.mobRam = "256GB";
		System.out.println("Calling By Objects");
		
		m1.displayMobileDetails();
		
		m2.displayMobileDetails();
		

//		System.out.println(m1.mobBrand);  To call the static variable in main method
//		System.out.println(m1.mobRam);
		
		
		
		
		
		
	}

}
