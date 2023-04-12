package ex03.inheritance;

public class Circle extends Point { // sub class 자손클래스
	private int r;

	public Circle() {
		this.r=5;
		System.out.println("default Circle Constructor");
	}

	@Override
	public String toString() {
		return getX() + " " + getY() + " " + r;
	}
}
