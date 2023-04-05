package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		int[] arr = { 7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7 };

		System.out.println("seek를 입력해주세요");
		int seek = new Scanner(System.in).nextInt();
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (i == seek) {
				cnt++;

			}

		}

		System.out.println(Arrays.toString(arr) + "에서\nseek " + seek + "의 개수는 " + cnt + "개");
		System.out.println("인덱스 위치: ");
	}
}
