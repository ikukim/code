package Scheduler;

public class least implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("상담전화를 가져옵니다");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 적은 상담원에게 할당합니다");
	}

}
