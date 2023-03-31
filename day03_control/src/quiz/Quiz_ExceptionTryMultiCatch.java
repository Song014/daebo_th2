package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz_ExceptionTryMultiCatch {
	public static void main(String[] args) {
		int x,y,result;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 2개를 입력해 주세요.");
			x = sc.nextInt();
			y = sc.nextInt();
			result = x/y;
			System.out.println(result);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
