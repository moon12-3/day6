package test.static1;

public class RunTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t1 = new TV(32, "Blue");
		TV t2 = new TV(55, "White");
		TV t3 = new TV(100, "Green");
		
		TV.producer = "samsung����";
		
		System.out.printf("t1�� �����ϴ� ��ü�� ����ʵ� color: %s, size: %d, producer %s\n",
									t1.getColor(), t1.getSize(), TV.producer);
		
		System.out.printf("t2�� �����ϴ� ��ü�� ����ʵ� color: %s, size: %d, producer %s\n",
									t2.getColor(), t2.getSize(), TV.producer);
		
		System.out.printf("t3�� �����ϴ� ��ü�� ����ʵ� color: %s, size: %d, producer %s\n",
									t3.getColor(), t3.getSize(), TV.producer);
	}

}
