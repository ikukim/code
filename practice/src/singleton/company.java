
package singleton;

public class company {
	
	private static company instance= new company();  //단하나만!! 내부에서만 생성
	
	
	private company(){
		
	}
	
	public static company getinstance() {		//static사용한메서드 생성으로 인해 외부에서 사용가능
		
		
		return instance;
	}
	
	
	
	
}
