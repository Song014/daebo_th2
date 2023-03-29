package quiz;

import java.util.Scanner;

public class Quiz_Max3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개 입력");
		int x = sc.nextInt();		int y = sc.nextInt();		int z = sc.nextInt();
		System.out.printf("입력값 %d %d %d\n",x,y,z);
		
		int tmp = 0;
		if(x<y) {
			tmp = x;
			x=y;
			y=tmp;
		}
		if(x<z) {
			tmp = x;
			x=z;
			z=tmp;
		}
		if(y<z) {
			tmp = y;
			y=z;
			z=tmp;
		}
		
		System.out.println(x+" "+y+" "+z);
	}
}
