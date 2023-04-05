package Quiz;

import java.util.Arrays;

public class QuizEx3 {
	public static void main(String[] args) {
		// 임의의 데이터, 임의의 찾을 데이터
		// 임의의 배열크기, 배열,찾는 숫자 선언;
		int n = (int) (Math.random() * 7 + 7);
		int[] arr = new int[n];
		int seek = (int) (Math.random() * 3 + 3);
		
		// 초기화
		System.out.println(n + "개의 배열");
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * 3 + 3);

		// 처리
		int cnt = 0;
		for (int num : arr) {
			if (num == seek)
				cnt++;
		}
		
		// 출력
		System.out.printf("%s 에서\nseek %d의 개수는\n%d", Arrays.toString(arr), seek, cnt);
	}
}
