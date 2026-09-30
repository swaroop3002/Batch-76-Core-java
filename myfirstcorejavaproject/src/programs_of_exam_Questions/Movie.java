package programs_of_exam_Questions;

public class Movie {
	int movieId;
	String movieName;
	String heroName;
	int availableSeats;
	static String theaterName = "Shiva Ganga"; 
	static String managerName = "Mr.Guptha";
	
	void displayMovieDetails() {
		System.out.println("Movie Id : " + movieId);
		System.out.println("Movie Name : " + movieName);
		System.out.println("Hero Name " + heroName);
		System.out.println("Available Seats : " + availableSeats);
	}

	void bookSeats() {
		availableSeats--;
	}
	
    static void displayTheaterDetails(){
		System.out.println(theaterName);
		System.out.println(managerName);
	}
	
	void changeManager(){
		managerName = "Swaroop";
	}
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		
		m1.movieId = 01;
		m1.movieName = "OG";
		m1.heroName = "Pawan Kalayan";
		m1.availableSeats = 6;
		
		m2.movieId = 02;
		m2.movieName = "Kushi";
		m2.heroName = "Kalayan Babu";
		m2.availableSeats = 4;
		
		displayTheaterDetails();
		
		System.out.println(" ");
		
		m1.displayMovieDetails();
		
		System.out.println(" ");
		
		m2.displayMovieDetails();

		System.out.println(" ");
		m1.bookSeats();
		m2.bookSeats();
		m1.displayMovieDetails();
		System.out.println(" ");
		m2.displayMovieDetails();
		
		System.out.println(" ");
		
		m1.changeManager();
		displayTheaterDetails();
		
	
	}

}
