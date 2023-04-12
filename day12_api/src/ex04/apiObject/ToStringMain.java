package ex04.apiObject;

class Rectangle {
	int x, y;

	public void disp() { // 출력 함수 사용자 정의
		System.out.println(x + " " + y);
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r);
	}
}
