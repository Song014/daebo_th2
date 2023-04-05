package Quiz;

import java.util.Scanner;

public class QuizEx4 {
	public static void main(String[] args) {
		// 비가 온 날에 대한 강수량 평균(소수점 2자리까지)
		

		// 30일 치 담을 배열과 변수선언
		System.out.println("Day Input: ");
		int n = new Scanner(System.in).nextInt();
		int[] dayArr = new int[n];

		// 배열에 하루마다 달라지는 강수량으로 초기화
		for (int i = 0; i < n; i++) {
			dayArr[i] = (int) ((Math.random() * 150));
		}

		// 처리 강수량 평균 구하는 식
		int sum = 0;
		for (int rain : dayArr)
			sum += rain;

		double avg = sum / (double) n;

		// 출력 일별로 
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i < dayArr.length; i++) {
			System.out.print(dayArr[i] + "ml\t");
			if ((i + 1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.printf("\n%d일간 강수량 평균은 : %.2fml", n, avg);

	}
}


