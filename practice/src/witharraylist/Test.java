package witharraylist;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer c1 =new Customer(10101,"k1");
		Customer c2 =new Customer(11111,"k2");
		Gold c3 =new Gold(22222,"g1");
		Vip c4 = new Vip(3333,"v1",123);
		
		
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		
		System.out.println("=========================");
		for(Customer customer:customerList) {
			System.out.println(customer.showCustInfo());
		}
		System.out.println("=========================");
		int price =1000;
		for(Customer customer:customerList) {
			int cost = customer.calPrice(1000);
			System.out.println(customer.getCustomerName()+"¥‘¿Ã"+cost+"¡ˆ∫“");
			System.out.println(customer.showCustInfo());
		}
		
	}
}
