package classes;

public class studenttest {
	public static void main(String[] args) {
		student james = new student(100,"james");
		james.setKorea(234);
		james.setmath(100);
		
		student tom = new student(101,"james");
		tom.setKorea(200);
		tom.setmath(90);
		
		james.showStudentInfo();
		tom.showStudentInfo();
	}
}
