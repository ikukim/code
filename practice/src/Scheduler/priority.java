package Scheduler;

public class priority implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("높은 고객의 전화를 먼저 가져온다");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill이 가장 높은 상담원에게 배분합니다");
	}

}
