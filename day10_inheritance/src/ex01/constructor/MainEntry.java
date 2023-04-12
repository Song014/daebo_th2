package ex01.constructor;

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(1,2);
		Circle c3 = new Circle(1,2,3);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
