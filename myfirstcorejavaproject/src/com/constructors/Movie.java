package com.constructors;

public class Movie {
	String name;
	String director;
	String producer;
	String hero;
	String heroine;
	double budget;
	String comedian;

	Movie(){
		
	}
	Movie(Movie m1,String producer){
		this.name = m1.name;
		this.director = m1.director;
		this.producer = producer;
	}
	Movie(String name,String director){
		this.name = name;
		this.director = director;
	}
	Movie(Movie m1 ,Movie m2 , String hero){
		this.name = m1.name;
		this.director = m1.director;
		this.producer = m2.producer;
		this.hero = hero;
	}
	
	public static void main(String[] args) {
		Movie m = new Movie();
		System.out.println("Main method started : ");
		Movie m1 = new Movie("Varanasi" , "SS RajaMouli");
		m1.getMovieDetails();
		System.out.println(" ");
		
		Movie m2 = new Movie(m1,"Minhaz");
		m2.getMovieDetails();
		
		System.out.println(" ");
		
		Movie m3 = new Movie(m1,m2,"Mahesh Babu");
		m3.getMovieDetails();
	}
	
	void getMovieDetails() {
		System.out.println("name of the movie : " + name);
		System.out.println("director of the movie : " + director);
		System.out.println("producer of the movie : " + producer);
		System.out.println("hero of the movie : " + hero);
		System.out.println("heroine of the movie : " + heroine);
		System.out.println("budget of the movie : " + budget);
		System.out.println("comedian of the movie : " + comedian);
	}

}
