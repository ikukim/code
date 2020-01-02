package array;

public class book {
	private String bookName;
	private String author;
	
	public book() {}
	public book(String bookName, String author) {
		this.bookName= bookName;
		this.author=author;
	}
	
	private String getBookName() {
		return bookName;
	}
	private void setBookName(String bookName) {
		this.bookName = bookName;
	}
	private String getAuthor() {
		return author;
	}
	private void setAuthor(String author) {
		this.author = author;
	}
	public void showinfo() {
		System.out.println(bookName+author);
	}
}
