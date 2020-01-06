package inheritage;

public class Vip extends Customer {



		private double saleRatio;
		private int agentiD;
		
	

		public Vip(int customerID, String customerName, int agentID) {												//�⺻ ���� ����
			super(customerID,customerName);
			customerGrade="vip";
			bonusRatio=0.05;
			saleRatio=0.1;
			this.agentiD=agentID;

		}
		
		public int calPrice(int price) {						//�޼��� �������̵� (�����)
			bonusPoint += price*bonusRatio;
			return price - (int)(price*saleRatio);
		}
		
		private int getAgentiD() {
			return agentiD;
		}



		public String showCustInfo() {
			return customerName + "���� �����"+customerGrade+"�̸�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�";
		}
		
		
	}


