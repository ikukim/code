package by;

public class bus {
	
	int busnumber;
	int passengercount;
	int money;
	
	public bus(int busnumber) {
		this.busnumber=busnumber;
	}
	
	public void take(int money) {
		this.money+=money;
		passengercount++;
	}
	
	public void showinfo() {
		System.out.println("����"+busnumber+"�� �°���"+passengercount+"�� ������"+money);
	}
	
	
}
