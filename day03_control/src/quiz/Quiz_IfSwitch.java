package quiz;

import java.util.Scanner;

public class Quiz_IfSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요");
		int su = sc.nextInt();
		
		if(0<=su && su<=100) {
			switch (su/15) {
			case 6:
			case 5:
				System.out.println("상");
				break;
			case 4:
				System.out.println("중");
				break;

			default: System.out.println("하");
				break;
			}
		} else {
			System.out.println("0~100 사이로 입력해주세요.");
		}
	}
}
