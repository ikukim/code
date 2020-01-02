package by;

public class subway {
	int subnumber;
	int passengercount;
	int money;
	
	public subway(int subnumber) {
		this.subnumber=subnumber;
	}
	
	public void take(int money) {
		this.money+=money;
		passengercount++;
	}
	
	public void showinfo() {
		System.out.println("ÁöÇÏÃ¶"+subnumber+"ÀÇ ½Â°´Àº"+passengercount+"¸í ¼öÀÔÀº"+money);
	}
	
}
