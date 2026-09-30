package languagefundamentals;

public class MovieTheatre {
	String movieName;
	int releasedYear;
	int ticketPrice;
	static int coutn = 0;
	MovieTheatre(){
		coutn++;
	}
	

	void displayMovieDetails() {
		System.out.println(movieName);

		System.out.println(releasedYear);

		System.out.println(ticketPrice);
}
	
	void changeTicketPrice() {
		ticketPrice = 300;
	}
	

	public static void main(String[] args) {
		System.out.println("Wel come to ARTS Productions");
		
		MovieTheatre m1 = new MovieTheatre();
		MovieTheatre m2 = new MovieTheatre();
		MovieTheatre m3 = new MovieTheatre();
		
		m1.movieName = "OG";
		m1.releasedYear = 2025;
		m1.ticketPrice = 250;
		
		m2.movieName = "Kushi";
		m2.releasedYear = 2012;
		m2.ticketPrice = 50;
		
		m3.movieName = "GabberSing";
		m3.releasedYear = 2010;
		m3.ticketPrice = 70;
				
		m1.displayMovieDetails();
		m1.changeTicketPrice();
		System.out.println(" ");
		m1.displayMovieDetails();
		System.out.println(" ");
		m2.displayMovieDetails();
		
		System.out.println(" ");
		m3.displayMovieDetails();
		
		System.out.println(" ");

		System.out.println("Number of Objects: " + coutn);
		
	}

}
