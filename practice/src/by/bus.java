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
		System.out.println("¹ö½º"+busnumber+"ÀÇ ½Â°´Àº"+passengercount+"¸í ¼öÀÔÀº"+money);
	}
	
	
}
