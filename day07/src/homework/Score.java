package homework;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 3;

		String[] meg = { "num", "name", "kor" };
		int[] num = new int[N];
		int[] kor = new int[N];
		int[] eng = new int[N];
		int[] com = new int[N];
		int[] total = new int[N];
		double[] avg = new double[N];
		String[] name = new String[N];
		char[] grade = new char[N];
		double avgAll = 0.0;
		int totalAll = 0;

		for (int i = 0; i < N; i++) {
			// 입력 번호, 이름, 국어,영어,수학 
			System.out.println("================================================");
			System.out.print("번호 입력"); num[i] = sc.nextInt();
			System.out.print("\n이름 입력"); name[i] = sc.next();
			System.out.print("\n국어 입력"); kor[i] = sc.nextInt();
			System.out.print("\n영어 입력"); eng[i] = sc.nextInt();
			System.out.print("\n전산 입력"); com[i] = sc.nextInt();
			// 총점 평균 학급총 평균 처리
			
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
		
		// 출력
	}
}
