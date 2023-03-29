package ex02.datatype;

public class MainEntry {
	// 정수 0, 실수 0.0, 문자열 null
	static int num;
	static char c;
	static String str;
	
	public static void main(String[] args) {
		System.out.println("static value = "+num+" "+str+" : "+c);
		int su = 30;
		System.out.println(su); // 4byte
		System.out.println(100); // 4byte
		
		long num = 20;
		System.out.println(num); // 8byte
		System.out.println(1000L); // 4byte

		double d = 13.34;
		System.out.println(d); // double
		System.out.println(13.34); // double
		System.out.println(13.34f); // float
		
		float f = 12.34f;
		System.out.println(f);
	}

}
