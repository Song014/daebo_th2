package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreArrayEx333 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 3;

		String[] name = new String[N];
		int[][] score = new int[N][N];
		int[] total = new int[N];
		char[] grade = new char[N];
		double[] avg = new double[N];

		for (int i = 0; i < N; i++) {

			System.out.println("================================================");
			System.out.print("\n이름 입력");
			name[i] = sc.next();
			for (int j = 0; j < N; j++) {
				score[i][j] = (int) (Math.random() * 100 + 1);
				total[i] += score[i][j];
			}

			avg[i] = total[i] / 3.0;

			// 평점 구하기 switch 사용
			switch ((int) avg[i] / 10) {
			case 10:
			case 9:
				grade[i] = 'A';
				break;
			case 8:
				grade[i] = 'B';
				break;
			case 7:
				grade[i] = 'C';
				break;
			case 6:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
			}

		}
		// 석차 처리
		int[] temp = Arrays.copyOf(total, N); // 총점 배열 복사
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		int[] rank = new int[N];
		for (int i = 0; i < N; i++) { // 총원 만큼
			for (int j = 0; j <= N - 1; j++) // 배열의 길이만큼
				if (total[i] == temp[j]) { // 총점 배열과 복사한 배열의 값이 같을때 랭크에
					rank[i] = N - j;
					break;
				}
		}

		for (int i = 0; i < N; i++) {
			System.out.println("============" + name[i] + "학생의 성적표=======");
			System.out.printf("국어 : %d 영어 : %d, 전산 : %d\n", score[i][0], score[i][1], score[i][2]);
			System.out.printf("총점 : %d 평균 : %.2f, 평점(학점) : %c, 석차 : %d \n", total[i], avg[i], grade[i], rank[i]);

		}
	}
}

// dd님 tjdwjrvy
// 국 영 컴 
// 총점 평균 평점 석차