package day05_While;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 점수 3개 입력(0~100), 연산자 하나 입력(+,-,*,/), 3과목과 연산 및 출력
		int kor, eng, su;
		char op;

		do {
			System.out.println("당신의 KOR 점수 입력 요망");
			kor = sc.nextInt();
		} while (kor < 0 || kor > 101);
		
		do {
			System.out.println("당신의 ENG 점수 입력 요망");
			eng = sc.nextInt();
		} while (eng < 0 || eng > 101);
		System.out.printf("입력된 점수 국어: %d 영어: %d \n", kor, eng);

		do {
			System.out.println("연산자(+,-,*,/) 찍어주세요");
			op = sc.next().charAt(0);
		} while ((op != '+') && (op != '-') && (op != '*') && (op != '/'));

		int result = 0;
		if (op == '+') {
			result = kor + eng;
		} else if (op == '-') {
			result = kor - eng;
		} else if (op == '*') {
			result = kor * eng;
		} else if (op == '/') {
			result = kor / eng;
		}

		System.out.printf("당신의 점수는 %d %c %d = %d", kor, op, eng, result);

	}
}
