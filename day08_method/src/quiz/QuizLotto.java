package quiz;

import java.util.Arrays;

public class QuizLotto {
	public static void init() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 45) + 1);
			if (isCheck(arr, i)) { // 중복이 있으면 i-- 해서 다시 담아주기
				i--;
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static boolean isCheck(int[] arr, int i) {
		boolean flag = false;
		for (int j = 0; j < i; j++)
			if (arr[i] == arr[j])
				flag = true;

		return flag;
	}

	public static void main(String[] args) {
		init();
	}
}
