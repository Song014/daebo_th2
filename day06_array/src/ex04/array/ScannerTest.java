package ex04.array;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		// next() vs nextLine()

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sc.next(); sc.next();
		String str = sc.next();

		System.out.println(name + ", " + str);
	}
}
