package supers;

class circle{
	
	static final double pi=3.141414;   //�ν��Ͻ� ������ static �����Ͽ� ��� �ν��Ͻ��� ��������
	private double radius;
	
	circle(double radius){		
		this.radius=radius;
	}
	
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
}

public class finall {
	public static void main(String[] args) {
		circle c1=new circle(1.23);
		circle c2=new circle(4.45);
		
		double c1Area = circle.pi*c1.getRadius()*c1.getRadius();
		double c2Area = c2.pi*c2.getRadius()*c2.getRadius();
	
		System.out.println(c1Area);
		System.out.println(c2Area);
	}
}
