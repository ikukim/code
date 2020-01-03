package supers;

class Person{
	private String name;
	private String email;
	
	Person(){}
	Person(String name){
		this.name=name;
	}
	Person(String name,String email){
		this(name);
		this.email=email;
	}
	
}

class Student extends Person{
	private int score;
	private int grade;
	
	Student(){}
	Student(String name,String email){
		super(name,email);
	}
	Student(String name,String email,int score){
		this(name,email);
		this.score=score;
	}
	Student(String name,String email,int score,int grade){
		this(name,email); // or super(name,email)    자신의 클래스의 다른 생성자를 호출할때는 this() , 부모클래스의 생성자를 호출할땐 super()
		this.score=score;
		this.grade=grade;
	}

public class stu {

}
