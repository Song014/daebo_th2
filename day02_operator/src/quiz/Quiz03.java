package quiz;

import java.util.Scanner;

// 이름 주소 연락처 입력 받아서 출력
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름:");
		String name = sc.nextLine();
		System.out.println("주소:");
		String addr = sc.nextLine();
		System.out.println("번호:");
		String phone = sc.nextLine();
		
		System.out.println(name+"\n" + addr+"\n"+phone);
		
	}
}
