package temple;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� ŵ�ϴ�");
	}
	
	public void turnoff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	public final void run() {					//���ø� �޼���-�߻�޼��峪 ������ �޼��带 Ȱ���Ͽ� ��ü����� �帧�� �����ϴ� �޼���(final�� �����ϸ� ������ �Ұ�)
		startCar();
		drive();
		stop();
		turnoff();
	}
	
	
}
