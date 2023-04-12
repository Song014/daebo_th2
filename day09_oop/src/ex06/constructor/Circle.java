package ex06.constructor;

public class Circle extends Point {
	private int r;

	public Circle() {
		super();
	}

	public Circle(int r) {
		this.r = r;
	}

	public Circle(int x, int y) {
		super(x, y);
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void radius() {
		System.out.printf("%.3f\n", (r * r * Math.PI));
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

}
