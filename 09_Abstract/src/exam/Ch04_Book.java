package exam;

public class Ch04_Book{
	private String title;
	private String author;
	private String publisher;
	
	Ch04_Book() {};
	Ch04_Book(String title , String author , String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "도서명 : "+title +", 저자명 : " + author + " , 출판사명 :"+publisher ;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title; 
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author; 
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getGender() {
		return publisher; 
	}
}
