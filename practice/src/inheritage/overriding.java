package inheritage;

public class overriding {
	public static void main(String[] args) {
		Customer c1 = new Customer(101010, "kk");
		int price = c1.calPrice(1000);
		System.out.println("���ұݾ�"+price+","+c1.showCustInfo());
		
		Vip c2 = new Vip(0101, "LL",100);
		price=c2.calPrice(1000);
		System.out.println("���ұݾ�"+price+","+c2.showCustInfo());
		
		Customer c3 = new Vip(0101, "LL",100);							//����޼�����  
		price=c3.calPrice(1000);
		System.out.println("���ұݾ�"+price+","+c3.showCustInfo());
	}
}
