package control;

public class ifexample2 {
	public static void main(String[] args) {
		int age=9;
		int charge=0;
		if(age < 8) {
			charge=1000;
			System.out.println("������ �Ƶ��Դϴ�");
		}
		else if(age<14) {
			charge=2000;
			System.out.println("�ʵ��л� �Դϴ�");
		}
		else if(age<20) {
			charge=2500;
			System.out.println("��/����л� �Դϴ�");
		}
		else{
			charge=3000;
			System.out.println("���� �Դϴ�");
		}
		
		System.out.println("������"+charge+"�� �Դϴ�");
		
		
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
