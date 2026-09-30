package languagefundamentals;

//Super() --> Super method example using  Inheritance  
public class Animal {
	
	String breed = "Greman Shepherd";
	int age = 2;
	String colour = "Black";
	
	Animal(){
		System.out.println(" Animal constructor called : ");
	}
	public static void main(String[] args) {
		System.out.println("Animal method called : ");

	}

}

class Dog extends Animal{
	String breed = "Golden Retriver";
	float age = 1.5F;
	String colour = "Brown";
	
	
	
	Dog(){
		System.out.println("Dog constructor called : ");
	}
	public static void main(String[] args) {
		System.out.println("main method started : ");
		Dog d = new Dog();
		d.AnimalInfo();
		
	}
	
	void AnimalInfo() {
		System.out.println("Security Dog informaiton");
		System.out.println("Animal Breed : " + super.breed);
		System.out.println("Animal agr : " + super.age);
		System.out.println("Animal colour : " + super. colour);
		System.out.println(" ");
		System.out.println("Friendly Dog informaiton");
		System.out.println("Animal Breed : " + this.breed);
		System.out.println("Animal agr : " + this.age);
		System.out.println("Animal colour : " + this.colour);
	}
}