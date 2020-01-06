package inheritage;

public class cutomertest {
	public static void main(String[] args) {
		Customer cust1 =new Customer(11011,"kim");
		//cust1.setCustomerID(10020);
		//cust1.setCustomerName("kim");
		cust1.setCustomerGrade("silver");
		
		Vip cust2 =new Vip(10110,"lee",1231);
		//cust2.setCustomerID(10021);
		//cust2.setCustomerName("lee");
		cust2.setCustomerGrade("vip");
		cust2.bonusPoint=1000;
		
		System.out.println(cust1.showCustInfo());
		System.out.println(cust2.showCustInfo());
		}
}
