package ex04.apiObject;

class Circle {
	int x = 5, y = 5;

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + "]";
	}
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		//
		if (c1 == c2) System.out.println("같다");
		else System.out.println("다르다");
		//
		line();
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");

		if (x == y) System.out.println("same");
		else System.out.println("not same");

		//
		line();
		String str = new String("Korea");
		String str1 = new String("Korea");

		System.out.println("참조형 자료형 비교");
		if (str == str1) System.out.println("주소 same");
		else System.out.println("주소 not same");

		if (str.equalsIgnoreCase(str1)) System.out.println("문자열 same");
		else System.out.println("문자열 not same");
	}

	private static void line() {
		System.out.println("=====================================================");
	}
}
