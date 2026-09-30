package programs_of_exam_Questions;

public class Ships {

	String name;
	double price;
	String colour;
	int rent;

	Ships() {
		super();
		System.out.println("no age consturctor called : ");
	}

	Ships(String name, int price, String colour, int rent) {
		System.out.println("four arg constructro called : ");
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.rent = rent;
	}
	
	void shipInfo() {
		System.out.println("name of the ship : " + name);
		System.out.println("price of the ship : " + price);
		System.out.println("colour of the ship : " + colour);
		System.out.println("rent of the ship : " + rent);

	}

	public static void main(String[] args) {
		Ships s = new Ships();
		
		Ships s1 = new Ships("swaroop", 1205000, "Black", 120000);
		s1.shipInfo();

	}
}	
class Boat extends Ships{
	
	Boat(){
//		super(); --> unna lenatte
		System.out.println("no arg constructor called from the Boat class : ");
		
	}
	Boat(String name,double price){
		super.name = name;
		super.price = price;
	}
	public static void main(String[] args) {
		System.out.println("Boat main method started : ");
		Boat b = new Boat();
		Boat b1 = new Boat("titanic",1268.2d);
		b1.shipInfo();
	}
}

