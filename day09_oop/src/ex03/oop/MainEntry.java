package ex03.oop;


public class MainEntry {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		Circle c = new Circle(3,5);
		Rectangle rect = new Rectangle(4, 4, 4, 4);
		c.setR(5);
		System.out.println(p);
		System.out.println("==================================================");
		System.out.print(c+" ");
		c.area();
		System.out.println("==================================================");
		System.out.println(rect);
		
	}
}
