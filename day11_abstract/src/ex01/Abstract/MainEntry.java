package ex01.Abstract;

abstract class Shape {
	protected double result = 0;

	public abstract double calc();

	public abstract void draw();

	public void show() {
		System.out.println("super class shape!");
	}
} // shape end

class Circle extends Shape {
	double r = 0.5;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		System.out.printf("원의 넓이는 %.2f인 원을 그렸습니다\n",calc());
	}

} // Circle End

class Rect extends Shape {
	int w=3,h=5;
	@Override
	public double calc() {
		result = w*h;
		return result;
	}

	@Override
	public void draw() {
		System.out.printf("사각형의 넓이는 %.2f인 사각형을 그렸습니다\n",calc());
	}

}

class Triangle extends Shape{
	int w=3,h=5;
	@Override
	public double calc() {
		result = w * h/2;
		return result;
	}

	@Override
	public void draw() {
		System.out.printf("삼각형의 넓이는 %.2f인 삼각형을 그렸습니다\n",calc());
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
//		Circle c= new Circle();
//		Rect r = new Rect();
//		
//		c.draw();
//		r.draw();
		
//		Shape sh = new Shape(); // 자체적으로 객체 생성 불가능
		Shape cShape = new Circle();
		Shape rShape = new Rect();
		Shape tShape = new Triangle();
		
		cShape.draw();
		rShape.draw();
		tShape.draw();
	}
}
