package ex02.datatype;

import java.util.Iterator;

public class DataType {
	public static void main(String[] args) {
		String str = "A"; // 문자열 "" 2byte
		char ch ='A'; // 문자 '' 1byte
		char ch2 = 67;
		char ch3 = 'b';
		int su = 20; String nickname = "happy"; double d = 12.34;
		
		System.out.println(str);
		System.out.println(ch);
		System.out.println((int)ch2);
		System.out.println(ch2+ch3);
		System.out.println(su);
		System.out.println("nickname = "+nickname);
		System.out.println("실수형 데이터 = "+d);

		for(int i=65; i<=90;i++) {
			System.out.print((char)i+" ");
		}
		
		System.out.println("\n\n////////////////////////////////////////////////\n");
		
		for(int i ='a';i<='z';i++) {
			System.out.print((char)i+" ");
		}
		
		System.out.println("\n\nboolean type");
		boolean flag = true;
//		boolean flag; // error 지역변수는 초기화 해야함
		System.out.println(flag);
		
	}
}
