package test.this3;

public class ThisTest {
	public ThisTest() {
		this(3);
		System.out.println("ThisTest() 생성자가 호출됨.");
	}
	
	public ThisTest(int n) {
		System.out.println("public ThisTest(int n) 생성자가 호출됨: "+n);
	}
}
