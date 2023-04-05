package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreMethod {

	static String[] name;
	static int[][] score;
	static int[] total;
	static char[] grade;
	static double[] avg;
	static int[] rank;

	public static void main(String[] args) {
		input();
		process();
		display();
	}

	private static void display() {
		for (int i = 0; i < score.length; i++) {
			System.out.println("============" + name[i] + "학생의 성적표=======");
			System.out.printf("국어 : %d 영어 : %d, 전산 : %d\n", score[i][0], score[i][1], score[i][2]);
			System.out.printf("총점 : %d 평균 : %.2f, 평점(학점) : %c, 석차 : %d \n", total[i], avg[i], grade[i], rank[i]);

		}
	}

	private static void process() {
		int n = total.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				total[i] += score[i][j]; // 총점

			avg[i] = total[i] / 3.0; // 평점

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
		int[] temp = Arrays.copyOf(total, n); // 총점 배열 복사
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		rank = new int[n];
		for (int i = 0; i < n; i++) { // 총원 만큼
			for (int j = 0; j <= n - 1; j++) // 배열의 길이만큼
				if (total[i] == temp[j]) { // 총점 배열과 복사한 배열의 값이 같을때 랭크에
					rank[i] = n - j;
					break;
				}
		}
	}

	/** 학생 수, 이름, 스코어 입력 */
	private static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력:");
		int n = sc.nextInt();

		name = new String[n];
		score = new int[n][n];
		total = new int[n];
		grade = new char[n];
		avg = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("================================================");
			System.out.print("\n이름 입력");
			name[i] = sc.next();
			for (int j = 0; j < n; j++) {
				score[i][j] = (int) (Math.random() * 100 + 1);
			}
		}
	}

}

//성적 처리

//입력받는 함수 따로
//출력함수 따로
//총점_평균 하나로
//학점