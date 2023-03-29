package quiz;

import java.util.Scanner;

public class Quiz_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = 0;
		int max2 = 0;

		if (num1 > num2)
			max = num1;
		else if(num1<num2)
			max = num2;
		else
			System.out.println("두 수가 모두 같습니다.");
		
		System.out.println("결과1 if:"+max);
		max2 = num1>num2 ? num1: num1<num2? num2 : 0 ;
		if(max2 > 0) 
			System.out.println("결과2 삼항:"+max2);
		else
			System.out.println("두 수가 모두 같습니다.");
	
		
	}
}
