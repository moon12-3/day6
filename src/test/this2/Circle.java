package test.this2;

public class Circle {
	
	private int r;
	private double circum, area;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public int getR() {
		return r;
	}


	public double getCircum() {
		return circum;
	}


	public double getArea() {
		return area;
	}


	// �������� r�� ���� �ѷ� ����ϴ� �޼ҵ�
	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}
	
	public static void print(Circle c) {
		System.out.printf("�������� %d���� ���� �ѷ��� %.2f���̴�.\n", c.getR(), c.getCircum());
		System.out.printf("�������� %d���� ���� ������ %.2f���̴�.\n", c.getR(), c.getArea());
	}
	
	// �������� r�� ���� ���� ����ϴ� �޼ҵ�
	public void calcArea() {
		area = Math.PI * Math.pow(r, 2);
	}
	
	public void showInfo() {
		calcCircum();
		calcArea();
		print(this);
	}
}
