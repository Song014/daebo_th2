package quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("국어: ");
		int kor = sc.nextInt();
		System.out.println("영어: ");
		int eng = sc.nextInt();
		System.out.println("전산: ");
		int jun = sc.nextInt();
		
		int hap = kor+eng+jun;
		double avg = hap/3.;
		
		System.out.println("송기석님의 성적표 =======================");
		System.out.println("국어: "+kor+", 영어: "+eng+", 전산: "+jun);
		System.out.printf("총점 : %d, 평균 : %.1f",hap,avg);
		
	}
}
