package ex02.array;

import java.util.Arrays;

public class MainEntry {
	public static void main(String[] args) {
		char[] ch;
		ch = new char[4];
		ch[0] = '3';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';

		char[] ch2 = new char[4];

		ch2[0] = 'S';
		ch2[1] = 'D';
		ch2[2] = 'W';
		ch2[3] = 'X';

		char[] ch3 = { '3', 'A', 'B', 'A' };

		// 배열의 길이(크기)
		System.out.println(ch.length);

		// 배열의 내용 출력
		System.out.println(ch[0]);

		//
		System.out.printf("ch %s ch2 %s ch3 %s\n", Arrays.toString(ch), Arrays.toString(ch2), Arrays.toString(ch3));

		for (char chVal : ch3) {
			System.out.print(chVal + "\t");
		}
	}
}
