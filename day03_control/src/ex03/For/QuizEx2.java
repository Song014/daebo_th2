package ex03.For;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n * i);
		}
	}
}

//package ex03.For;
//
//public class QuizEx2 {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + "\t");
//				if (i % 20 == 0) {
//					System.out.println();
//				}
//			}
//		}
//
//	}
//}
