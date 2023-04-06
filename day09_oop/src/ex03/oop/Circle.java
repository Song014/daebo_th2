package ex03.oop;

public class Circle extends Point{
	private int  r;
	
	Circle(int x,int y) {
		super(x,y);
	}

	public int getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


	public void area() {
		System.out.println(r * r * Math.PI);
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
}


