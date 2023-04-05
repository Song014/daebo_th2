package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreMethod2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력해주세요");
		int n = sc.nextInt();

		String[] name = new String[n];
		int[][] score = new int[n][3]; // 인원, 과목 수

		input(name, score);

		int[] total = new int[n];
		char[] grade = new char[n];
		double[] avg = new double[n];

		for (int i = 0; i < n; i++) {
			total[i] = total(i, score);
			avg[i] = avg(i, total);
			grade[i] = grade(i, avg);
		}

		int[] rank = new int[n];
		
		rank = rank(n, total, rank);

		display(name, score, total, avg, grade, rank);
	}

	private static void display(String[] name, int[][] score, int[] total, double[] avg, char[] grade, int[] rank) {
		for (int i = 0; i < score.length; i++) {
			System.out.println("============" + name[i] + "학생의 성적표=======");
			System.out.printf("국어 : %d 영어 : %d, 전산 : %d\n", score[i][0], score[i][1], score[i][2]);
			System.out.printf("총점 : %d 평균 : %.2f, 평점(학점) : %c, 석차 : %d \n", total[i], avg[i], grade[i], rank[i]);
		}
	}

	private static int[] rank(int n, int[] total, int[] rank) {
		int[] temp = Arrays.copyOf(total, n); // 총점 배열 복사
		Arrays.sort(temp);
		rank = new int[n];
		for (int i = 0; i < n; i++) { // 총원 만큼
			for (int j = 0; j <= n - 1; j++) // 배열의 길이만큼
				if (total[i] == temp[j]) { // 총점 배열과 복사한 배열의 값이 같을때 랭크에
					rank[i] = n - j;
					break;
				}
		}
		return rank;

	}

	private static char grade(int i, double[] avg) {
		char[] grade = new char[avg.length];
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
		return grade[i];
	}

	private static double avg(int i, int[] total) {
		return total[i] / 3.0;
	}

	private static int total(int i, int[][] score) {
		int[] total = new int[score.length];
		for (int j = 0; j < score[0].length; j++)
			total[i] += score[i][j];

		return total[i];
	}

	private static void input(String[] name, int[][] score) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.println("================================================");
			System.out.print("\n이름 입력");
			name[i] = sc.next();
			for (int j = 0; j < score[0].length; j++) {
				score[i][j] = (int) (Math.random() * 100 + 1);
			}
		}
	}

}

//성적 처리

//입력받는 함수 따로
//출력함수 따로
//총점_평균 학점 하나로
