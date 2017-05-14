package three_exerc4;

import java.util.Scanner;

public class Librarian {
private Library libr;

public Librarian() {
	super();
}

public Librarian(Library libr) {
	super();
	this.libr = libr;
}

public Library getLibr() {
	return libr;
}

public void setLibr(Library libr) {
	this.libr = libr;
}

public void findMeBooksFromAuthor(String author){
	libr.printBooksFromAuthor(author);
}

public void findMeAvailableBooks(){
	System.out.println("The following books are available at the library for renting");
	libr.printAvailableBooks(); 
}

public void findMeBook(String vivlio){
	
	libr.printBookDetails(vivlio);
	}

public void findMostPopularBook(){
System.out.println("Most popular book:"); 
libr.printTheMostPopularBook();
}

public void showOptions(){
	Scanner sc=new Scanner(System.in);
	String alfar;
	do {
		System.out.print("\n");
		System.out.println("Welcome to the Bootcamp library."); 
		System.out.println("How do you want to proceed?");
		System.out.println("1. Show all available books");
		System.out.println("2. Search for a book (by book title)");
		System.out.println("3. Display books from a specific author");
		System.out.println("4. Show me the most popular book");
		System.out.println("q. Quit");
		
		alfar=sc.next();
	switch (alfar){
	
	case "1":
		findMeAvailableBooks();
		break;
	case "2":
		System.out.println("Give book title:");
		String alfar1=sc.next();
		findMeBook(alfar1);
		break;
	case "3":
		System.out.println("Give author:");
		alfar1=sc.next();
		findMeBooksFromAuthor(alfar1);
		break;
	case "4":
		findMostPopularBook();
		break;
	case "q":
		break;
	default:
		System.out.println("wrong input");
	}
	}
	while (!alfar.equals("q"));
}

}
