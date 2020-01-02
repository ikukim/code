package array;

public class arraytest3 {
	public static void main(String[] args) {
		char[] alpabets= new  char[26];
		char ch='a';
		
		for(int i=0;i<alpabets.length;i++,ch++) {
			alpabets[i]=ch;
			System.out.println(alpabets[i]);
		}
	}
}
