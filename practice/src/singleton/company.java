
package singleton;

public class company {
	
	private static company instance= new company();  //���ϳ���!! ���ο����� ����
	
	
	private company(){
		
	}
	
	public static company getinstance() {		//static����Ѹ޼��� �������� ���� �ܺο��� ��밡��
		
		
		return instance;
	}
	
	
	
	
}
