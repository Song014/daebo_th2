package quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.println("국 영 전 순으로 점수 입력해주세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int jun = sc.nextInt();
		
		int hap = kor+eng+jun;
		double avg = hap/3.;
		char grade = 0;
		
		
		switch ((int)avg/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7: grade = 'C';
			break;
		case 6: grade = 'D';
			break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			grade = 'F';
			break;

		default:
			System.out.print("100~0의 숫자만 입력해주세요");
			break;
		}
		
		System.out.println("송기석님의 성적표 =======================");
		System.out.printf("국어: %d, 영어: %d, 전산: %d",kor,eng,jun);
		System.out.printf("\n총점 : %d, 평균 : %.1f, 학점 : %c",hap,avg,grade);
		
		
	}
}
