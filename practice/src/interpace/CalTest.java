package interpace;

public class CalTest {
	public static void main(String[] args) {

		Calc cal = new CompleteCalc();
		int[] arr= {1,2,3,4,5};
		int sum= Calc.total(arr);
		System.out.println(sum);
		
	}
}
