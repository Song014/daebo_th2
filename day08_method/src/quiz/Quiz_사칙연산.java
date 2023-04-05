package quiz;

import java.util.Scanner;

public class Quiz_사칙연산 {
	public static void main(String[] args) {
		System.out.println("값을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		plus(a, b);
		mul(a, b);

		System.out.println("a-b = "+sub(a, b));
		System.out.println("a/b = "+div(a, b));

	}

	private static double div(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.print("0으로 나눌수 없습니다:\t");
			return (double)a / b;
		} 
	}

	private static int sub(int a, int b) {
		return a - b;
	}

	private static void plus(int a, int b) {
		System.out.println("a+b = "+a + b);
	}

	private static void mul(int a, int b) {
		System.out.println("a*b = "+a * b);
	}
}

//plus(+) mul(*) 리턴 없이
//sub(-), div(/) 리턴 타입 있고 div 는 예외 처리