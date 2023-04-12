package ex01.constructor;

public class Circle {
	private int x, y, r;

	public Circle() {
		this(100,100,5);
	}

	public Circle(int r) {
		this(10,7,r);
		this.r = r;
	}

	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}
	
}
