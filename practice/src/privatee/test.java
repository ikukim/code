package privatee;

public class test {
	public static void main(String[] args) {
		book b1 = new book("java",100);
		b1.setPrice(2000);
		b1.setTitle("aa");
		System.out.println(b1.getTitle());
		System.out.println(b1.getPrice());
		
	}
}
