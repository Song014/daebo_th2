package ex03.IO;

import java.io.IOException;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("input = ");
		try {
			int su;
			while ((su = System.in.read()) != 1) {
				if(su == 10||su ==13|| su==32) continue;
				if(su == 113||su==81)break;
				
				char ch = (char)su;
				System.out.println(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//package ex03.IO;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//public class MainEntry {
//	public static void main(String[] args) {
//		InputStream is = System.in;
//
//		try {
//
//			System.out.println("단일 문자 입력:");
//			int num = is.read() - 48; // 예외 발생, '0'~'9'; 48 ~ 57
////			System.out.println((char) num);
//			is.read();	is.read(); // 자바는 2byte // 화이트스페이스 처리용 
//			int num2 = is.read() - 48; // 동작 
//			System.out.println(num+num2);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//}
