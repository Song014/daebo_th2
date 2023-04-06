package ex02.oop;

// 접근제한자 public은 한군데만 사용할 수있고 public 붙은곳에 보통 main이 들어간다
class Point {
	private int x;
	private int y;

	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void display() {
		System.out.println(x + " " + y);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		pt.display(); // 기본값
		Point pt2 = new Point(2, 3); // 생성자를 통한 초기화

		pt.setX(3); // setter를 사용한 초기화
		pt.setY(5);
		pt.display();
		pt2.display(); 
	}
}
