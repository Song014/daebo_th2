package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {
	public static void main(String[] args) throws ArithmeticException, InputMismatchException{
		int x,y,result;
		
		System.out.println("x, y = ");
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x/y;
		System.out.println(result);
		
	}
}
