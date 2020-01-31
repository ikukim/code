package object;
class book{
	String title;
	String author;
	book(String title,String author){
		this.title=title;
		this.author=author;
		
	}
	
	@Override
	public String toString() {
		return title+"/"+author;
	}

}
public class tostring {
	public static void main(String[] args) {
		book b1= new book("1¹øÃ¥","A");
		String s=b1.toString();
		System.out.println(s);
		System.out.println(b1);
	}

	
}
