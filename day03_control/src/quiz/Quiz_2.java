package quiz;

import java.util.Scanner;

public class Quiz_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		String strop = sc.next();
		char op = strop.charAt(0);

		int result = 0;
		if (op == '+') {
			result = x + y;
		} else if (op == '-') {
			result = x-y;
		} else if (op == '*') {
			result = x * y;
		} else if (op == '/') {
			result = x / y;
		}
		
		System.out.println(x + " " + op + " " + y + " = " + result);
	}
}
