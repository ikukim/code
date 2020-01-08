package interpace;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 !=0){
		return num1/num2;
		}
		return ERROR;
	}
	
	public void showinfo() {
		System.out.println("Calc인터페이스 구현완료");
	}
}
