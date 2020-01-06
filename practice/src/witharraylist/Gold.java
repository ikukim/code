package witharraylist;

public class Gold extends Customer{
	double saleRatio;
	public Gold(int customerID, String customerName) {
		super(customerID,customerName);
		
		customerGrade="gold";
		bonusRatio=0.02;
		saleRatio=0.1;
	}
	

	@Override
	public int calPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}


}
