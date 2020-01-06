package inheritage;

public class Vip extends Customer {



		private double saleRatio;
		private int agentiD;
		
	

		public Vip(int customerID, String customerName, int agentID) {												//기본 고객의 정보
			super(customerID,customerName);
			customerGrade="vip";
			bonusRatio=0.05;
			saleRatio=0.1;
			this.agentiD=agentID;

		}
		
		public int calPrice(int price) {						//메서드 오버라이딩 (덥어쓰기)
			bonusPoint += price*bonusRatio;
			return price - (int)(price*saleRatio);
		}
		
		private int getAgentiD() {
			return agentiD;
		}



		public String showCustInfo() {
			return customerName + "님의 등급은"+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다";
		}
		
		
	}


