package day05_While;

public class 주말과제3 {
	public static void main(String[] args) {
		// 1/2+2/3+3/4+4/5+5/6+6/7+7/8+8/9+9/10 = ? 7.07
		double sum =0;
		for(double i = 1;i<10;i++) {
			sum +=i/(double)(i+1);
		}
		System.out.printf("%.2f",sum);
	}
}
