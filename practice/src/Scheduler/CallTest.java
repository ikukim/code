package Scheduler;

import java.io.IOException;

public class CallTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("R,L,P�� Ÿ���� �Է��Ͻÿ�");
		
		int ch= System.in.read();
		Scheduler she = null;
		
		if(ch=='R' || ch=='r') {
			she=new RoundRobin();
			
		}else if(ch=='L' || ch=='l') {
			she=new least();
		}else if(ch=='P' || ch=='p') {
			she=new priority();
		}else {
			System.out.println("����");
			return;
		}
		she.getNextCall();
		she.sendCallToAgent();
	}

}
