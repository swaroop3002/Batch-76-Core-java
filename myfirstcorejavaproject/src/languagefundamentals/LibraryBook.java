package languagefundamentals;

public class LibraryBook {
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	static String libraryName;
	static String librarianName;
	static String changeLibrarianName;
	
	void hello() {
		System.out.println("BookId :" + bookId );
		System.out.println("Book Title  :" + bookTitle);
		System.out.println("Author Name :" + authorName);
		System.out.println("Available Copies :" + availableCopies);
	}
	void changeLibrarian() {
		librarianName ="Swaroop";
	}

	public static void main(String[] args) {
		
		System.out.println("Wel come to Library" );
		
		LibraryBook L1 = new LibraryBook();
		
		L1.bookId = 01;
		L1.bookTitle = "TheMidNight";
		L1.authorName = "Matt Haig";
		L1.availableCopies = 20;
		
		
		libraryName ="City central Library";
		librarianName = "Krupakar";
		
//		System.out.println("BookId :" + L1.bookId);
//		System.out.println("Book Title  :" + L1.bookTitle);
//		System.out.println("Author Name :" + L1.authorName);
//		System.out.println("Available Copies :" + L1.availableCopies);
		
		L1.hello();
		System.out.println("Library Name :" + libraryName);
		System.out.println("Librarian Name :" + librarianName);
		
		L1.changeLibrarian();
		
		
//		L1.libraryName ="City Central Library";
//		L1.librarianName = "Krupakar";
//		L1.hello();
//		System.out.println(L1.bookId+","+L1.bookTitle);

//		System.out.println("Wel come to Library" );
	}

}
