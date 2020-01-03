package array;

import java.util.Arrays;

public class aaa {
	static void updateArray(int[] B) {
		for(int i=0;i<B.length;i++) {
			B[i]+=10;
		}
		
	}
	
	public static void main(String[] args) {
		int[] A = {3,5,1,7,3,10};
		System.out.println(Arrays.toString(A));
		updateArray(A);
		System.out.println(Arrays.toString(A));
		
	}
}
