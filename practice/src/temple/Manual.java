package temple;

public class Manual extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전 ");
		
	}

	@Override
	public void stop() {
		System.out.println("사람이 브래이크 작동");
	}
	
}
