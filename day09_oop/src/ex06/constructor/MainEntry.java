package ex06.constructor;

public class MainEntry {
	public static void main(String[] args) {

		Point pt = new Point();
		System.out.println(pt);
		System.out.println(pt.hashCode());

		Point pt1 = new Point(3);
		System.out.println(pt1);
		System.out.println(pt1.hashCode());

		Point pt2 = new Point(3, 3);
		System.out.println(pt2);
		System.out.println(pt2.hashCode());

		Circle c = new Circle();
		
		c.setR(5);
		c.radius();
		System.out.println(c);

	}
}
