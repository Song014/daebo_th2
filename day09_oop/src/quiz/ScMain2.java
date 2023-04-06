package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력해주세요.");

		int n = sc.nextInt();
		Score[] score = new Score[n];

		int[] rank = new int[n];
		// 학생 여러명 입력과 동시에 처리까지
		for (int i = 0; i < score.length; i++) {
			score[i] = new Score();
			score[i].input(n);
			rank[i] = score[i].getTotal();
		}

		rank = rank(rank);

		
		for (int i = 0; i < score.length; i++) {
			score[i].disp(rank, i);
		}
	}

	private static int[] rank(int[] total) {

		int[] temp = Arrays.copyOf(total, total.length); // 총점 배열 복사
		Arrays.sort(temp);
		int[] rank = new int[total.length];
		for (int i = 0; i < total.length; i++) { // 총원 만큼
			for (int j = 0; j <= total.length - 1; j++) // 배열의 길이만큼
				if (total[i] == temp[j]) { // 총점 배열과 복사한 배열의 값이 같을때 랭크에
					rank[i] = total.length - j;
					break;
				}
		}
		return rank;
	}
}