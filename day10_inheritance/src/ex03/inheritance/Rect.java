package ex03.inheritance;

public class Rect extends Point {
	private int x2, y2;

	public Rect() {
		super();
		this.x2=20;
		this.y2=20;
		System.out.println("default Rect Constructor");
	}

	public Rect(int x2, int y2) {
		super();
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("[x2,y2] Rect Constructor");
	}

	public Rect(int x, int y, int x2, int y2) {
		super(x,y);
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("[x,y,x2,y2] Rect Constructor");
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return "x=" + super.getX() + ", y=" + super.getY() + ", x2=" + x2 + ", y2=" + y2 ;
	}
}
