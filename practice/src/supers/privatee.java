package supers;

class A{
	private int dataA;
	
	A(){}
	A(int dataA){
		this.dataA=dataA;
	}
	void printA() {
		System.out.println(dataA);
	}
}

class B extends A{
	
	private int dataB;
	
	B(){}
	B(int dataA, int dataB){
		super(dataA);
		this.dataB=dataB;
	}
	void printB() {
		System.out.println(dataB);
	}
}
public class privatee {
	public static void main(String[] args) {
		B c = new B(10,20);
		c.printA();
		c.printB();
	}
}
