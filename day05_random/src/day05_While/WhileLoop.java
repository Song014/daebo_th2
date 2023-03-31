package day05_While;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su;
		char yn;

		while (true) {

			do {

				System.out.println("당신의 점수 입력 요망!");
				su = sc.nextInt();
			} while (su<0||su>101);
			System.out.printf("당신의 점수 %d ", su);
			
			System.out.println("\n계속 하실래요? y or n");
			yn = Character.toLowerCase(sc.next().charAt(0));
			
			if (yn == 'n') break;

		}
		System.out.println("======================끝=====================");
	}
}