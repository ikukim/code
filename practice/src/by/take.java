package by;

public class take {
	public static void main(String[] args) {
		student james = new  student("james",5000);
		student tom = new  student("tom",5000);
		
		
		bus bus1=new bus(100);
		james.takebus(bus1);
		james.showinfo();
		bus1.showinfo();
		
		
		subway sub1=new subway(2);
		tom.takesub(sub1);
		tom.showinfo();
		tom.showinfo();

	}
}
