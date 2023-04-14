package quiz.video;

import java.util.Scanner;

// video 추가/삭제/리스트/수정/종료
public class VideoMainEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoM videoM = new VideoM();

		int bno = 1;
		Video vd;
		while (true) {
			System.out.println("1. 추가\t2. 삭제\t3. 수정\t4. 출력\t5. 종료 중에 선택한 번호를 입력 해주세요.");
			int setnum = sc.nextInt();
			
			switch (setnum) {
			case 1:
				System.out.println("추가하실 타이틀, 카테고리를 적어주세요");
				sc.nextLine();
				videoM.add(bno++,sc.nextLine(),sc.nextLine());
				break;
			case 2: // index 값
				videoM.view();
				System.out.println("삭제 하실 비디오의 Index 번호를 입력하세요.");
				videoM.delete(sc.nextInt());
				break;
			case 3: // index 값
				videoM.view();
				System.out.println("수정하실 비디오의 Index 번호를 입력하세요.");
				videoM.update(sc.nextInt());
				break;
			case 4:
				videoM.view();
				break;
			case 5:
				System.out.println("종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}


