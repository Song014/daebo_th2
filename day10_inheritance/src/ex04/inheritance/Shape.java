package ex04.inheritance;

public class Shape {
	protected int w, h;
	protected double result;

	public Shape() { // 멤버변수의 초기화
		w = h = 0;
		result = 0;
	}

	public Shape(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public double calc() {
		result = w*h;
		return result;
	}

	@Override
	public String toString() {
		return "너비=" + w + ", 높이=" + h + ", 결과=" + result;
	}
}
