package interpace;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		Buy buycust = customer;
		buycust.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order();
		buycust.order();
		seller.order();
		
		
				
	}
}	
