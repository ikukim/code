package witharraylist;

public class Vip extends Customer {



		private double saleRatio;
		private int agentID;
		
	

		public Vip(int customerID, String customerName, int agentID) {												//�⺻ ���� ����
			super(customerID,customerName);
			customerGrade="vip";
			bonusRatio=0.05;
			saleRatio=0.1;
			this.agentID=agentID;

		}
		
		public int calPrice(int price) {						//�޼��� �������̵� (�����)
			bonusPoint += price*bonusRatio;
			return price - (int)(price*saleRatio);
		}
		
		private int getAgentiD() {
			return agentID;
		}

		@Override
		public String showCustInfo() {
			return super.showCustInfo()+"������ :"+agentID;
		}



		
		
	}


