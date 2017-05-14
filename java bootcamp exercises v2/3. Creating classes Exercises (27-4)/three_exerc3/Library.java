package three_exerc3;

public class Library {
	private Book[] books;

	public Library() {
		super();
	}
	

	public Library(Book[] books) {
		super();
		this.books = books;
	}


	public Book[] getBooks() {
		return books;
	}


	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public void printAvailableBooks(){
		int j=0;
		System.out.println("Books available for renting:");
		for (int i=0;i<20;i++){
			if (books[i].isAvailable())
			{j++;
				System.out.println(j+"."+books[i].toString());}
		}}
		
		public void printBookDetails(String vivlio){
			String str1=new String();
			for (int i=0;i<20;i++){
			if (books[i].getTitle().equals(vivlio))
				{
				System.out.println("Book with title="+"'"+ books[i].getTitle()+"'" +" found! Details:");
				str1=books[i].toString();
			break;}
			else
				str1=new String("Book with title: "+"'"+vivlio+"' not found");
			}
			System.out.println(str1);
		}
		
		public void printBooksFromAuthor(String author){
			String str1=new String();
			int j=0;
			for (int i=0;i<20;i++){
			if ((books[i].getAuthor().getAuthor()).equals(author))
				{
				str1=books[i].toString();
				System.out.println("Book with author="+"'"+ books[i].getAuthor().getAuthor()+"'" +" found! Details:");
				System.out.println(str1);
				j++;}
			}
			if (j==0){
				System.out.println("Book with author: "+"'"+author+"' not found");
			}
			
		}
		
		public void printTheMostPopularBook(){
			int max=books[0].getTimesRented();
		
			for (int i=1;i<20;i++){
				if (max>=books[i].getTimesRented())
					max=max;
				else
					max=books[i].getTimesRented();
				}
			
			for (int i=1;i<20;i++){
			if (books[i].getTimesRented()==max){
				//System.out.println("Most popular book: ");
			    System.out.println("Book-> "+books[i].toString());}

			}
}
}
