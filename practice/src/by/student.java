package by;

public class student {
	String studentName;
	int grade;
	int money;
	
	public student(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;

	}
	
	public void takebus(bus bus) {
		bus.take(1000);
		money-=1000;
	}
	public void takesub(subway sub) {
		sub.take(1500);
		money-=1500;
	}
	
	public void showinfo() {
		System.out.println(studentName + "남은돈="+money+"입니다");
	}
	
}
