package abstractclass;

public class ComputerTest {
	public static void main(String[] args) {
		//Computer c1 = new Computer(); 				abstract 클래스는 생산불가능
		Computer c2 = new Desktop();
		//Computer c3= new Notebook();
		Computer c4 =new Mynotebook();
		
		c2.displqy();
		c4.displqy();
	}
}
