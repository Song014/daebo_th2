package quiz;

import java.util.Scanner;

public class Quiz_year {
	public static void main(String[] args) {
		// 윤년 평년 판정 프로그램
		int year = new Scanner(System.in).nextInt();
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(year +"은 윤년입니다.");
		} else {
			System.out.println(year +"은 윤년이 아닙니다");
		}
		
	}
}
