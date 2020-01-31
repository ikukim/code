package string;

public class classtest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		
		Class pClass=person.getClass();
		System.out.println(pClass.getName());
		
		Class pClass1=Person.class;
		System.out.println(pClass1.getName());
		
		Class pClass2=Class.forName("string.Person");
		System.out.println(pClass2.getName());

	}
}
