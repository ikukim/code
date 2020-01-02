package staticex;

public class student {
	
	private static int serialnum=10000;
	
	int studentID;
	String studentName;
	
	
	public student() {
		serialnum++;
		studentID=serialnum;
		
		
	}
	
	private static int getSerialnum() {
		int i=10;  //지역변수
		i++;
		System.out.println(i);
		
		//studentName="김일국";  인스턴스변수 -----static안에서는 사용 불가능
		return serialnum;
	}
	
	
	
	



	
	
	
}
