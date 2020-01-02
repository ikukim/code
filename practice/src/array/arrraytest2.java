package array;

public class arrraytest2 {
	public static void main(String[] args) {
		double[] num= new double[5];
		int size=0;
		num[0]=10.1; size++;
		num[1]=10.2; size++;
		num[2]=10.3;  size++;
		
		
		double total=1;
		for(int i=0;i<size;i++) {
			
			total *=num[i];
		}
		System.out.println(total);
	}
}
