package Scheduler;

public class priority implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("���� ���� ��ȭ�� ���� �����´�");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� skill�� ���� ���� �������� ����մϴ�");
	}

}
