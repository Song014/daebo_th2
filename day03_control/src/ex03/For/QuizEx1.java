package ex03.For;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String result ="";
		for(int i=1; i<=n;i++) {
			result +="*";
			System.out.println(result);
		}
		
		
	}
}
//public class QuizEx1 {
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//int sum = 0;
//int cnt = 0;
//for(int i = 1;i<=100;i++) {
//	if(i%3 ==0) {
//		sum+=i;
//		cnt++;
//	}
//}
//System.out.printf("3의 배수의 합: %d\t개수: %d",sum,cnt);
//	}
//}