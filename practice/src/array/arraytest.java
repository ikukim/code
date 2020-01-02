package array;

public class arraytest {
	public static void main(String[] args) {
		
		
		int[] number=new int[] {0,1,2};         //초기화시
		for(int i=0;i<number.length;i++) {

			System.out.println(number[i]);
		}
		
		
		System.out.println("------------");
		int[] num= new int[10]; //40바이트 생성
		num[0]=1;	
		num[1]=2;
		num[2]=3;
		
		for(int i=0;i<num.length;i++) {

			System.out.println(num[i]);
		}
		
		System.out.println("------------");

		int[] studentIDs=new int[10];				
		for(int i=0;i<studentIDs.length;i++) {

			System.out.println(studentIDs[i]);
		}
	
	}
}
