package quiz.score;

import java.util.Scanner;

public class ScoreMainEntry {
	private static ReportService rp = new ReporyServiceImp();
	public static void main(String[] args) {
		// 성적 처리 mvc로
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 프로그램을 시작합니다");
		Student st;
		while (true) {
			System.out.println("1.학생별 성적 입력 2.성적 리스트 출력 번호  0.종료 입력:");
			int select = sc.nextInt();
			switch (select) {
			case 1 -> {
				System.out.println("학생의 이름  국어  영어  컴퓨터 점수순으로 입력하세요");
				rp.add(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			case 2 -> {
				rp.showList();
			}
			case 0 -> {
				System.out.println("성적 프로그램을 종료합니다.");
				System.exit(0);
			}
			default -> {
				System.out.println("다시 입력하세요.");
			}
			}
			System.out.println("====================================================");
		}
	}
}
