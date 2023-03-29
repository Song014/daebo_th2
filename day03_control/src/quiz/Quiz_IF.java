package quiz;

import java.util.Scanner;

public class Quiz_IF {
	public static void main(String[] args) {
		//학점 구하기 100~90 A 89~80 B
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int su = sc.nextInt();
		
		if(su<=100 && su>=90) System.out.println("A");
		else if(su<=89 && su>=80) System.out.println("B");
		else if(su<=79 && su>=70) System.out.println("C");
		else if(su<=69 && su>=60) System.out.println("D");
		else if(su<=59 && su>=0) System.out.println("F");
		else System.out.println("유효한 점수가 아닙니다.");
	}
}