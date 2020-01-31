package privatee;

public class book {
	private String title;
	private int price;
	
	book(String title,int price){
		this.title=title;
		this.price=price;
		
	}
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	int getPrice() {
		return price;
	}
	 void setPrice(int price) {
		this.price = price;
	}
	
	public void printbook() {
		System.out.println("title:"+title);
		System.out.println("price:"+price);
	}
	

	
}
