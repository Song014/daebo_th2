package Quiz;

import java.util.Arrays;

public class QuizEx1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=0; i<5;i++) {
			arr[i] = (int) ((Math.random()*100)+1);
		}
		
		int sum = 0;
		for(int num : arr) {
			sum+=num;
		}
		System.out.println(Arrays.toString(arr)+"의 합은");
		System.out.println(sum);
	}
}
