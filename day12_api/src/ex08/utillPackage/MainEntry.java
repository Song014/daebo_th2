package ex08.utillPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println(c.get(Calendar.MONTH) + 1 + "월"); // 월은 0에서 부터 시작
		System.out.println(c.get(Calendar.DATE) + "일");
		line();
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.printf("현재시간은 %d:%d:%d",h,m,s);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2023, 4,13,0,0);
		if(c1.after(c2)) {
			System.out.println("현재시간은 2018년 1월 1일 이후입니다");
		} else if(c1.before(c2)) {
			System.out.println("현재시간은 2018년 1월 1일 이전입니다");
		} else if(c1.equals(c2)){
			System.out.println("현재시간은 2018년 1월 1일 입니다");
		}
	}
	private static void line() {
		System.out.println("=======================================================================");		
	}
}
