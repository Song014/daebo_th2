package quiz;

import java.util.Scanner;

public class ScoreMainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력해주세요.");
		int n= sc.nextInt();
		
		Score score = new Score();
		score.input(n);
		score.disp();
		
		
		
	}
}
