package ex02.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요. (w,a,s,d) =\t");
		Scanner sc = new Scanner(System.in);

		String str = "korea";
		char ch = str.charAt(4);
		System.out.println(ch);

//		char ch = sc.next().charAt(0);	

		switch (ch) {
		case 'w':
			System.out.print("서울");
			break;
		case 's':
			System.out.print("부산");
			break;
		case 'a':
			System.out.print("대구");
			break;
		case 'd':
			System.out.print("강릉");
			break;

		default:
			System.out.println("잘못 선택하셧습니다. 다시선택해주세요");
			System.exit(0);// 강제종료 명령
		}
		System.out.println("을(를) 선택하셧습니다");

	}
}

//package ex02.Switch;
//
//import java.util.Scanner;
//
//public class MainEntry {
//	public static void main(String[] args) {
//		System.out.println("point = ?");
//		int point = new Scanner(System.in).nextInt();
//		
//		
//		switch (point) { // long 형을 제외한 정수, 문자
//		case 0:
//			System.out.printf("포인트 %d점",point);
//			break;
//		case 1:
//			System.out.printf("포인트 %d점",point);
//			break;
//		case 2:
//			System.out.printf("포인트 %d점",point);
//			break;
//		case 3:
//			System.out.printf("포인트 %d점",point);
//			break;
//
//		default: // 생략가능 예외처리 기능
//			System.out.printf("입력하신 %d 는 없는 번호 입니다.\n다시 입력해주세요\n",point);
//			break;
//		}
//		System.out.println("끝");
//		
//	}
//}
