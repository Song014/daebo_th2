package quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		int a,n,ranVal;
		Random ran = new Random();
		
		ranVal = ran.nextInt(100)+1;
		a=5;
		
		while(a>=1) {
			System.out.println("숫자를 입력해주세요");
			n = new Scanner(System.in).nextInt();
			if(1>=n && n<=100) {
				System.out.println("1~100까지만 입력해주세요");
				continue;
			}
			System.out.printf("%d번 남았습니다.\n",a-1);
			if(n>ranVal) {
				System.out.println("Down");
			} else if(n<ranVal) {
				System.out.println("Up");
			} else {
				System.out.println("정답입니다.");
				System.exit(0);
			}
			System.out.println("=====================================================");
			a--;
		}
		System.out.println("아쉽지만 다음 기회에");
	}
}
