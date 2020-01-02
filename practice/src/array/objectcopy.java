package array;

public class objectcopy {
	public static void main(String[] args) {
		book[] bookarray1= new book[3];
		book[] bookarray2= new book[3];
		
		bookarray1[0]=new book("태백1","조정래");
		bookarray1[1]=new book("태백2","조정래");
		bookarray1[2]=new book("태백3","조정래");
		
		bookarray2[0]=new book();
		bookarray2[1]=new book();
		bookarray2[2]=new book();
		
		/*for(int i=0;i<bookarray1.length;i++) {
			bookarray2[i].setAuthor(bookarray1[i].getAuthor());
		}*/
		System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
		
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showinfo();
		}
		
		String[] array= {"a","b","c","d"};
		for(String lang:array) {
			System.out.println(lang);
		}
		
		
	}
}
