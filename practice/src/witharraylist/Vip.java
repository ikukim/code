package witharraylist;

public class Vip extends Customer {



		private double saleRatio;
		private int agentID;
		
	

		public Vip(int customerID, String customerName, int agentID) {												//기본 고객의 정보
			super(customerID,customerName);
			customerGrade="vip";
			bonusRatio=0.05;
			saleRatio=0.1;
			this.agentID=agentID;

		}
		
		public int calPrice(int price) {						//메서드 오버라이딩 (덥어쓰기)
			bonusPoint += price*bonusRatio;
			return price - (int)(price*saleRatio);
		}
		
		private int getAgentiD() {
			return agentID;
		}

		@Override
		public String showCustInfo() {
			return super.showCustInfo()+"당담상담원 :"+agentID;
		}



		
		
	}


