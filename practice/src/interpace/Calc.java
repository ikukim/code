package interpace;

public interface Calc {
	
	double PI=3.14;
	int ERROR=-88888;
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	static int total(int[] arr) {
		int total=0;
		for(int i: arr) {
			total+=i;
		}
		return total;
	}

}
