package test.static1;

public class TV {
	public static String producer; // 클래스 변수 공유 영역에 단 1번만 할당됨
	private int size;	// 인스턴스 변수 객체 생성할 때마다 독립된 멤버 필드로 할당됨
	private String color;
	
	public TV(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}
	
	
}
