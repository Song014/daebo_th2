package ex02.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자함수 호출
		
		System.out.println("정수형 데이터 입력 요망:");
		int su = sc.nextInt();
		
		System.out.println("받은 수 : "+su);
		
		
	}
}
