package array;

public class aa {
	int add(int x,int y) {
		int result;
		result=x+y;
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] score ={2,1,3,12,124};
		int[] score2= new int[5];

		for(int i=0;i<score.length;i++) {
			System.out.println();
		}
		
		System.arraycopy(score, 0, score2, 0, 5);
	}
}
