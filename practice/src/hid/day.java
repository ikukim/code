package hid;

class dayday{
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month==2) {
			if(day<1 || day>28) {
				System.out.println("날짜 오류입니다");
			}
		}
		else {
			this.day = day;

		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}

public class day {
	public static void main(String[] args) {
		dayday day= new dayday();
		day.setMonth(2);
		day.setDay(10);
		day.setYear(2020);
		
		
		System.out.println(day.getYear()+day.getMonth()+day.getDay());
	}
}
