package quiz;

import java.util.Scanner;

public class Quiz_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 점수는 ? = ");
		int jumsu = sc.nextInt();

		switch (jumsu/10) {
		case 10:
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		case 6:
			System.out.print("D");
			break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			System.out.println("F");
			break;

		default:
			System.out.print("100~0의 숫자만 입력해주세요");
			break;
		}

	}
}
