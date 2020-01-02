package array;

public class bookarray {
	public static void main(String[] args) {
		book[] lib= new book[5];
		lib[0]=new book("1권","첫째");
		lib[1]=new book("2권","둘째");
		lib[2]=new book("3권","셋째");
		lib[3]=new book("4권","넷째");
		lib[4]=new book("5권","다섯째");
		
		
		for(int i=0;i<lib.length;i++) {
			System.out.println(lib[i]);
		}
		for(int i=0;i<lib.length;i++) {
			
			lib[i].showinfo();
			
		}
		
		
	}
}
