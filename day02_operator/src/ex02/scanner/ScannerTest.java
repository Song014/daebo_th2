package ex02.scanner;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("String input :");
		String s1 = sc.next(); // 개행 문자단위
		String s2 = sc.nextLine(); // 개행문자 무시

		System.out.println("String1 value = " + s1);
		System.out.println("String2 value = " + s2);

		int num = sc.nextInt();
		double su = sc.nextDouble();
		System.out.println(num + ", " + su);

		System.out.println(sc.nextInt() + ", " + sc.nextDouble());
	}
}
