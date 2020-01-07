package abstractclass;

public abstract class Computer {
	public abstract void displqy();									//선언만 한 것 
	public abstract void typing();

	
	public void turnon() {
		System.out.println("전원키기");
	}
	public void turnoff() {
		System.out.println("전원끄기");
	}
	
}

