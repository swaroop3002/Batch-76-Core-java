package programs_of_exam_Questions;

public class ZoomCar {


	String getCompanyName() {
		return "ZoomCars";
	}
	int getdailyRent() {
		return 1500;
	}
	int calculatebasecost(int days) {
		return getdailyRent() * days;
	}
	int getFixedInsurancefee() {
		return 500;
	}
	int totalCost(int days) {
		return calculatebasecost(days) + getFixedInsurancefee();
	}
	String welcomeMessage() {
		return "wel come to zoom car showroom .....";
	}
	

	public static void main(String[] args) {
		System.out.println(" Important msg for the customer .....");
		ZoomCar z = new ZoomCar();
		System.out.println(z.welcomeMessage());
		System.out.println("company Name : " + z.getCompanyName());
		System.out.println("Daily rent of the car : " + z.getdailyRent());
		System.out.println("Base cost of the car per a day : " + z.calculatebasecost(1));
		System.out.println("Fixed Insurence of the car per day : " + z.getFixedInsurancefee());
		System.out.println("total cost of the car per a day : " + z.totalCost(1));
		
		

	}

}
