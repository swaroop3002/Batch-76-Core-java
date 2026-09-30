package programs_of_exam_Questions;

public class LibraryBook {
	int bookId;
    String bookTitle;
	String authorName;
	int availableCopies;
	static String libraryName;
	static String librarianName;
//	int count = 0;
	
	void displayBookDetails() {
		System.out.println("Book Id : " + bookId);
		System.out.println("Book Title : " + bookTitle);
		System.out.println("Author Name : " + authorName);
		System.out.println("Available Copies : " + availableCopies);
		System.out.println("Library Name : " + libraryName);
		System.out.println("Librarian Name : " + librarianName);
	}
	void issueBook() {
		availableCopies--;
		
	}
	void changeLibrarianName() {
		librarianName ="Haritha_vinod";
	}
	

	public static void main(String[] args) {

		LibraryBook b1 = new LibraryBook();
		LibraryBook b2 = new LibraryBook();
		System.out.println("Wel come to Library .....");
		
		b1.bookId = 01;
		b1.bookTitle = "The_Night_Kings";
		b1.authorName = "Swaroop";
		b1.availableCopies = 10;
		libraryName="city of Hyderabad";
		librarianName = "Minhaz";
		
		b2.bookId = 02;
		b2.bookTitle = "House Of Dragons";
		b2.authorName = "Haritha";
		b2.availableCopies = 5;
		libraryName="city of Hyderabad";
		librarianName = "Minhaz";
		
		b1.displayBookDetails();
		System.out.println(" ");
		b2.displayBookDetails();
		System.out.println(" ");
		b1.issueBook();
		
		b1.displayBookDetails();
		System.out.println(" ");
		b2.changeLibrarianName();
		b2.displayBookDetails();
		
		
	}

}
