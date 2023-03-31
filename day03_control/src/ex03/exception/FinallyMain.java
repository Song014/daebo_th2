package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyMain {
	public static void main(String[] args) {
		int x, y, result;

		try {
			System.out.println("x, y = ");
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			result = x / y;
			System.out.println(result);
		} catch (InputMismatchException e) {
			System.out.println("문자열은 넣을 수 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조건 처리"); 
		}
	}
}
