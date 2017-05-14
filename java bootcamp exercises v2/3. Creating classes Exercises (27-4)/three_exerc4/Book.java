package three_exerc4;

public class Book {
	private String title;
	private Author author;
	private  String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;
	public Book() {
		super();
	}
	public Book(String title, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.physicalCopies = physicalCopies;
		this.availableCopies = availableCopies;
		this.timesRented = timesRented;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getPhysicalCopies() {
		return physicalCopies;
	}
	public void setPhysicalCopies(int physicalCopies) {
		this.physicalCopies = physicalCopies;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	public int getTimesRented() {
		return timesRented;
	}
	public void setTimesRented(int timesRented) {
		this.timesRented = timesRented;
	}
	
	public String toString(){
		return "title: "+title+" "+author.toString()+" isbn: "+isbn
				+" physicalCopies: "+physicalCopies+
				" availableCopies: "+availableCopies+" timesRented: "+timesRented;
	}
		
	public void	rentPhysicalCopy(){
		if (availableCopies>0)
			System.out.println("Success!");
		else
			System.out.println("Not Success");
		
	}
		
public boolean isAvailable(){
	if (availableCopies>0)
		return true;
	else
		return false;
}

//public boolean hasAuthor(Author author){
//	if (this.author.equals(author))
	//	return true;
	//else
	//	return false;
	//}

public boolean hasAuthor(String author){
	if (this.author.getAuthor().equals(author))
		return true;
	else
		return false;
}

}
