package exam;

public class Ch04_Book implements Ch04_LibraryController{
	String title;
	String author;
	String publisher;
	
	Ch04_Book() {};
	Ch04_Book(String title , String author , String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	@Override
	public void insertMember() {
		
	}
	@Override
	public void myInfo() {
	};
}
