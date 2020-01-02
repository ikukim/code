package classes;

public class student {
	int studentID;
	String studentName;
	subject korea;
	subject math;
	
	public student() {
		korea =new subject("국어");
		math = new subject("수학");
	}
	public student(int id, String name) {   	//생성자 오버로드
		studentID = id;
		studentName = name;
		
		korea =new subject("국어");
		math = new subject("수학");

	}
	
	
	public void setKorea(int score) {
		korea.setScore(score);
		
	}
	
	public void setmath(int score) {
		math.setScore(score);
		
	}
	
	public void showStudentInfo() {
		int total = korea.getScore()+math.getScore();
		System.out.println("총점은"+total);
	}
}
