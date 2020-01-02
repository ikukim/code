package control;

public class ifexample2 {
	public static void main(String[] args) {
		int age=9;
		int charge=0;
		if(age < 8) {
			charge=1000;
			System.out.println("미취학 아동입니다");
		}
		else if(age<14) {
			charge=2000;
			System.out.println("초등학생 입니다");
		}
		else if(age<20) {
			charge=2500;
			System.out.println("중/고등학생 입니다");
		}
		else{
			charge=3000;
			System.out.println("성인 입니다");
		}
		
		System.out.println("입장료는"+charge+"원 입니다");
		
		
		int a=1;
		int b=10;
		int max=0;
		if(a>b) {
			max = a;
		}
		else {
			max=b;
		}
		
		max=(a>b) ? a:b;
	}
	
	
	
}
