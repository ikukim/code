package temple;

public class CarTest {
	public static void main(String[] args) {
		Car mycar = new Manual();
		mycar.run();
		
		Car aicar = new Ai();
		aicar.run();
		
	}
}
