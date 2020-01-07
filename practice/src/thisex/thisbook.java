package thisex;

class book{
		String title;
		int price;
		
		book(String title,int price){
			this.title=title;
			this.price=price;
		}
}
public class thisbook {
	public static void main(String[] args) {
		book b1=new  book("첫째 책",10000);
		book b2=new  book("둘째 책",20000);
		
		System.out.println(b1.title+"-"+b1.price);
		System.out.println(b2.title+"="+b2.price);
		System.out.println(b1);
	}

	
}
