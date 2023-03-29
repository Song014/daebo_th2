package quiz;

import java.util.Scanner;

public class Quiz_IF2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 영어 컴퓨터 점수를 적어주세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();

		String result = "";
		double avg = (kor + eng + com) / 3.0;

		if (kor >= 40 && eng >= 40 && com >= 40 && avg >= 60) {
			result = "합격";
		} else {
			result = "불합격";
			if (kor < 40)
				System.out.println("국어 "+ kor +"점 과락");
			if (eng < 40)
				System.out.println("영어 "+ eng +"점 과락");
			if (com < 40)
				System.out.println("국어 "+ com +"점 과락");
			if (avg < 60)
				System.out.println("평균 60점 미만");
		}

		System.out.printf("평균 = %.1f\n", avg);
		System.out.println("결과" + result);
	}
}

