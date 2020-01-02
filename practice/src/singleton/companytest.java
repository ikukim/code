package singleton;

import java.util.Calendar;

public class companytest {
	public static void main(String[] args) {

		company c1=company.getinstance();
		company c2=company.getinstance();
		//company c3=new company();     ¿¡·¯
		System.out.println(c1);
		System.out.println(c2);
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
	}
}
