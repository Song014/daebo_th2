package ex03.inheritance;

public class Point { // super class sub class
	private int x, y;

	public Point() {
		x = y = 10;
		System.out.println("default Point Constructor");
	}

	
	public Point(int x) {
		this(x,9);
		System.out.println("X Point Constructor");
	}


	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("X,Y Point Constructor");
	}

	public int getX() {
		return x;
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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}