package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			menu();
			int select = Integer.parseInt(br.readLine());
			switch (select) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			default:
				break;
			}
		}

	}

	private static void menu() {
		System.out.println("===============튜터링 시스템===============");
		System.out.println("1.정보등록 2.매칭 3.현황 4. 종료");
		System.out.println("===========================================\n\n");
	}
}

// 경력자와 학생간 튜터링 시스템
// 1. 경력자인지 학생인지 확인후
// 2. 경력자 and 학생 매칭 여부