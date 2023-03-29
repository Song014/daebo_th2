package ex03.operator;

public class OperatorTest {
	public static void main(String[] args) {
		// 대입 연산자

		int x = 2, y = 3, result;
		result = x + y;
		System.out.println("x =" + x + " y =" + y);
		System.out.println("x+y = " + result);

		x += y;
		System.out.println("x+y = " + x);

		x *= y;
		System.out.println("x*y = " + x);

		x += 1; // x + 1; x++; 동일
	}
}
