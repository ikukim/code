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
		int i=10;  //��������
		i++;
		System.out.println(i);
		
		//studentName="���ϱ�";  �ν��Ͻ����� -----static�ȿ����� ��� �Ұ���
		return serialnum;
	}
	
	
	
	



	
	
	
}
