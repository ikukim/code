package supers;

class Parent{
	int x=10;
	int y=20;
	
	void show() {
		System.out.println("parentshow");
	}
	void print() {
		System.out.println("parentprint");
	}
	
	
}

class Child extends Parent{
	int y=30;
	int z=20;
	
	void show() {
		System.out.println("childshow");
	}
	void check() {
		System.out.println("parentcheck");
	}
	
	
}

public class par {
	public static void main(String[] args) {
		Child c= new Child();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		
		c.show();
		c.print();
		c.check();
		

	}
}
