package quiz;

import java.util.Scanner;

public class Quiz_last_month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월을 넣어주세요: ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = 31;
		boolean flag = false;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월의 마지막 날은 " + day + "일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월의 마지막 날은 30일 입니다.");
			break;
		case 2:
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				System.out.println("윤년입니다.");
				flag = true;
			}
			day = flag? 29 : 30;
			System.out.println(month + "월의 마지막 날은 " + day + "일 입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 1월 ~ 12월까지 입력해주세요.");
			break;
		}

		// 변수 선언
		// 입력
		// 처리
		// 결과

	}
}
