package array;

public class bookarray {
	public static void main(String[] args) {
		book[] lib= new book[5];
		lib[0]=new book("1��","ù°");
		lib[1]=new book("2��","��°");
		lib[2]=new book("3��","��°");
		lib[3]=new book("4��","��°");
		lib[4]=new book("5��","�ټ�°");
		
		
		for(int i=0;i<lib.length;i++) {
			System.out.println(lib[i]);
		}
		for(int i=0;i<lib.length;i++) {
			
			lib[i].showinfo();
			
		}
		
		
	}
}
