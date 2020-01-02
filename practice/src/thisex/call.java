package thisex;

class person{
	String name;
	int age;
	
	public person(){
		this("¿Ã∏ß1",1);
	}
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
}


public class call {
	public static void main(String[] args) {
		person p1 = new person();
		System.out.println(p1.name);
	}
}
