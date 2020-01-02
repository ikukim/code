package control;

public class switchcase {
	public static void main(String[] args) {
		int rank=2;
		char medalcolor;
		if(rank==1) {
			medalcolor='G';
			
		}
		else if(rank==2) {
			medalcolor='S';
			
		}
		else if(rank==3) {
			medalcolor='B';
			
		}
		else{
			medalcolor='A';
			
		}
		
		switch(rank) {
			case 1: medalcolor='G';
			break;
			
			case 2: medalcolor='S';
			break;
			
			case 3: medalcolor='B';
			break;
			
			default: medalcolor='A';
		}
		System.out.println(rank+"등 메달의 색은"+medalcolor+"");
		
		
	
	}

}
