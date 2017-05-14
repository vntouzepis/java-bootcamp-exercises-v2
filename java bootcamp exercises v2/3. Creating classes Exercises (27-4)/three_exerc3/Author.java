package three_exerc3;

public class Author {
	private String Author;
	
	
	
	public Author() {
		super();
	}



	public Author(String author) {
		super();
		Author = author;
	}



	public String getAuthor() {
		return Author;
	}



	public void setAuthor(String author) {
		Author = author;
	}



	public String toString(){
		return "Author: "+Author;
		
	}

}
