package temple;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 킵니다");
	}
	
	public void turnoff() {
		System.out.println("시동을 끕니다");
	}
	
	public final void run() {					//템플릿 메서드-추상메서드나 구현된 메서드를 활용하여 전체기능의 흐름을 정의하는 메서드(final로 선언하면 재정의 불가)
		startCar();
		drive();
		stop();
		turnoff();
	}
	
	
}
