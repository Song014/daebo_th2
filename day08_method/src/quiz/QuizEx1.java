package quiz;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		display();
		add(1, 2, 3, 4, 5, 6);
		sub(1, 2);
	}

	private static void display() {
		System.out.println("안녕하세요 더하고 빼는 함수를 만드는 공간입니다");
	}

	private static void sub(int... i) {
		int sub = 0;
		for (int n : i) {
			sub -= n;
		}
		System.out.printf("sub = %d\n", sub);
	}

	private static void add(int... i) {
		int add = 0;
		for (int n : i) {
			add += n;
		}
		System.out.printf("add = %d\n", add);
	}
}

// add(+) 함수 인자값 두개 
// sub(-)
