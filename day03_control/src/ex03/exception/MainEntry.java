package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int x, y, result;

		try {
			System.out.println("x, y = ");
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			result = x / y;
			System.out.println(result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("문자열은 넣을 수 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println(e.getMessage());;
			e.printStackTrace();
		}

	}
}

//package ex03.exception;
//
//import java.util.Scanner;
//
//public class MainEntry {
//	public static void main(String[] args) {
//		System.out.println("x, y = ");
//		int x = new Scanner(System.in).nextInt();
//		int y = new Scanner(System.in).nextInt();
//		
//		if (y == 0) {
//			System.out.println("0으로 나눌수 없습니다");
//			System.exit(0);
//		}
//		
//		int result = x/y;
//		System.out.println(result);
//
//	}
//}
