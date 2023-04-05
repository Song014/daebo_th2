package ex03.array;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수를 입력해주세요");
		int student = sc.nextInt();

		int[][] score = new int[student][3];
		int[] sum = new int[student];
		String[] subject = {"국어","영어","전산"};
		String[] name = new String[score.length];

		for (int i = 0; i < score.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = sc.nextLine();
			System.out.println((i + 1) + "번째 학생 국어, 영어, 전산 점수를 입력하세요 : ");
			for (int j = 0; j < score[0].length; j++) {
				score[i][j] = sc.nextInt();
				while(score[i][j] < 0 || score[i][j]>100) {
					System.out.println(subject[j]+"부터 다시 입력하세요 0~100 사이의 정수를 입력해야 합니다.");
					score[i][j] = sc.nextInt();
				}
				sum[i] += score[i][j];
			}
		}

		for (int i = 0; i < sum.length; i++) {
			double avg = sum[i] / 3.0;
			char grade= ' ';
			switch ((int) avg / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				grade = 'F';
				break;
			default:
				System.out.println("잘못된 평균이 산출되었습니다.");
				System.exit(0);
			}

			System.out.println("============" + name + "학생의 성적표=======");
			System.out.printf("총점 : %d 평균 : %.2f, 평점(학점) : %c\n", sum[i], avg, grade);
			System.out.println("더 입력하시겠어요?");
			String ans = sc.next();
			if(ans.equalsIgnoreCase("n")) break;

		}
	}
}