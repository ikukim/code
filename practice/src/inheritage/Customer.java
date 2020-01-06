package inheritage;

public class Customer {
	protected int customerID;							//protected 패키지가 달라도 상속관계에서는 보임
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;


	protected double bonusRatio;

	
	public Customer() {						//기본 고객의 정보
		customerGrade="silver";
		bonusRatio=0.01;
		System.out.println("customer호출");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="silver";
		bonusRatio=0.01;
		
	}
	
	public int calPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustInfo() {
		return customerName + "님의 등급은"+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다";
	}
	int getCustomerID() {
		return customerID;
	}
	void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	String getCustomerName() {
		return customerName;
	}
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	String getCustomerGrade() {
		return customerGrade;
	}
	void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	double getBonusRatio() {
		return bonusRatio;
	}
	void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
}
