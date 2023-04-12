package ex05.wrapper;

import java.awt.Point;

public class MainEntry {
	public static void main(String[] args) {
		Integer ia = new Integer(10);
		Integer ib = new Integer("10");
		String su = "30";
		Point pt = new Point();
		System.out.println(pt);

		System.out.println(ia);
//		System.out.println(ia.getClass().getName() + "@"+Integer.toh);

		int x = 77;

		double y = 5.5;
		System.out.println(x + ", " + y);
		x = (int) y; // 명시적 형변환
		System.out.println(x + ", " + y);
		// Boxing vs unBoxing
		int c = ia;
		int d = ib;
		int num = Integer.parseInt(su);
		System.out.println(c + " " + d + " " + num);

		System.out.printf("최대값 %d\n", ia.MAX_VALUE);
		System.out.printf("최소값 %d\n", ia.MIN_VALUE);

		Double dd = new Double(12.34);

		System.out.printf("더블 래퍼%f\n", dd);

		System.out.println();
		c = (int) dd.doubleValue();
		System.out.printf("형변환 c의 값은? %d \n", c);

		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111", 2);

		System.out.println(e);
		System.out.println(f);
		
		int xx = 3; // stack	
		Integer yy = new Integer(3); // Heap
		
		xx = yy.intValue();// 옛날 버전
		xx = yy; // 현재 버전 auto boxing/ unboxing
		
		
	}
}
