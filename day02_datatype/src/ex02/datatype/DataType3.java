package ex02.datatype;

public class DataType3 {
	// 진법 - 2진 8진 10진 16진
	public static void main(String[] args) {
		int su = 10;
		System.out.println("10 진수는: "+su); //%d 10진수 ,%o 8진수 ,%x 16진수
		System.out.printf("8 진수는: %o",su);
		System.out.printf("\n16 진수는: %x",su);
		
		System.out.printf("\n%d",012); // 8진수(012) --> 10진수 10
		System.out.printf("\n%d",0xA); // 16진수(0xA) --> 10진수 10
		System.out.println("\n---------------------------------------------------------------");
		double f= 12.34;
		System.out.println(f);
		float ff = 5.6f;
		System.out.println(ff);
		
	}
}
