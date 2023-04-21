package quiz.bmi;

import java.io.*;
import java.util.*;

public class BmiMainEntry {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BmiController bc = new BmiController(br);

		System.out.println("비만도 측정 프로그램을 시작합니다.");
		System.out.println("==================================");

		while (true) {

			System.out.println("[1.추가 2.삭제 3.출력 4.수정 5.저장 6.읽기 0.프로그램 종료] 중 하나를 입력해주세요.");
			int select = Integer.parseInt(br.readLine());
			switch (select) {
			case 1: // 추가
				System.out.println("이름: ");
				String name = br.readLine();
				System.out.println("키: ");
				int height = Integer.parseInt(br.readLine());
				System.out.println("몸무게: ");
				int weight = Integer.parseInt(br.readLine());
				System.out.println("성별");
				Boolean gender = br.readLine().equals("남") ? true : false;

				bc.add(name, height, weight, gender);
				break;
			case 2: // 삭제
				if (bc.view()) {
					System.out.println("삭제할 index 번호를 선택하세요");
					bc.remove(Integer.parseInt(br.readLine()));
				}
				break;
			case 3: // 출력
				bc.view();
				break;
			case 4: // 수정
				if (bc.view()) {
					bc.update(Integer.parseInt(br.readLine()));
				}
				break;
			case 5: // 파일저장
				if (bc.view()) {
					System.out.println("저장할 사람의 index");
					bc.fileWrite(Integer.parseInt(br.readLine()));
				}
				
				break;
			case 6: // 파일불러오기
				bc.fileRead();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("다시 입력해주세요");
				break;
			}

		}

	}

}
