package three_exerc3;

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
}
