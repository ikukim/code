package temple;

public class Ai extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행시작");
	}

	@Override
	public void stop() {
		System.out.println("자율주행스탑");
	}
	
}
