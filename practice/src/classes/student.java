package classes;

public class student {
	int studentID;
	String studentName;
	subject korea;
	subject math;
	
	public student() {
		korea =new subject("����");
		math = new subject("����");
	}
	public student(int id, String name) {   	//������ �����ε�
		studentID = id;
		studentName = name;
		
		korea =new subject("����");
		math = new subject("����");

	}
	
	
	public void setKorea(int score) {
		korea.setScore(score);
		
	}
	
	public void setmath(int score) {
		math.setScore(score);
		
	}
	
	public void showStudentInfo() {
		int total = korea.getScore()+math.getScore();
		System.out.println("������"+total);
	}
}
