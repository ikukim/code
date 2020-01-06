package inheritage;

public class Customer {
	protected int customerID;							//protected ��Ű���� �޶� ��Ӱ��迡���� ����
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;


	protected double bonusRatio;

	
	public Customer() {						//�⺻ ���� ����
		customerGrade="silver";
		bonusRatio=0.01;
		System.out.println("customerȣ��");
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
		return customerName + "���� �����"+customerGrade+"�̸�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�";
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
