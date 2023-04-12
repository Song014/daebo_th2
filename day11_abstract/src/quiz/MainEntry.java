package quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = { "Bus", "SubWay", "Bicycle", "Plain" };
		Trans[] trans = { new Bus(), new Subway(), new Biclycle(), new Plain() };

		for (int i = 0; i < trans.length; i++)
			trans[i].name(name[i]);

		int num = 0;
		do {
			while (true) {
				System.out.print("원하는 교통편의 숫자를 고르세요.(1.지하철 / 2.버스 / 3.자전거 / 4.비행기 / 5.종료) : ");
				num = sc.nextInt();
				switch (num) {
				case 1:
					trans[num - 1].show();
					break;
				case 2:
					trans[num - 1].show();
					break;
				case 3:
					trans[num - 1].show();
					break;
				case 4:
					trans[num - 1].show();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				default:
					System.out.println("숫자를 다시 입력하세요!");
				} // switch
			}
		} while (num != 1 && num != 2 && num != 3 && num != 4);

	}
}
