package languagefundamentals;

public class LibraryBooks {
	
	
	int bookId;
	String bookName;
	String authorName;
	int availableCopys;
	String libraryName;
	String librarianName;
	
	void displayBookDetails() {
		System.out.println("Book Id :" + bookId);
		System.out.println("Book Name :" + bookName);
		System.out.println("Author Name :" + authorName);
		System.out.println("Available Copies :" + availableCopys);
		System.out.println("Library Name :" + libraryName);
		System.out.println("Librarian Name :" + librarianName);
	}
	
	void displayLibraryDetails() {
		System.out.println("Library Name:" + libraryName);
		System.out.println("Librarian Name:" + librarianName);

	}
	
	void changeLibrarian() {
		librarianName = "Basha";
	}
	

	public static void main(String[] args) {
		
		System.out.println("Wel come to Library");
		
		LibraryBooks book1 = new LibraryBooks();
		LibraryBooks book2 = new LibraryBooks();
		
		book1.bookId = 01;
		book1.bookName = "the Mid Night";
		book1.authorName = "Sam";
		book1.availableCopys = 10;
		book1.libraryName = "city of Hyderabad";
		book1.librarianName = "Swaroop";
		
		book2.bookId = 02;
		book2.bookName = "The Night School";
		book2.authorName = "Ram";
		book2.availableCopys = 20;
		book2.libraryName = "city of Kurnool";
		book2.librarianName = "Haritha";
		
		System.out.println("************************************************************");
		
		book1.displayBookDetails();
				
		book2.displayBookDetails();
		
		book1.changeLibrarian();
		
		book1.displayBookDetails();
		
//		System.out.println("Wel come to Library");

	}

}
