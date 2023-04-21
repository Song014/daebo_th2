package ex05.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
//			OutputStream os = new FileOutputStream("test.txt");
//			OutputStream os = new FileOutputStream("C:\\app\\test.txt");
			OutputStream os = new FileOutputStream("C:/app/test2.txt");

			while (true) {
				System.out.println("문자열 입력 요망");
				String str = sc.nextLine() + "\r\n"; // 개행
				if (str.toUpperCase().equals("EXIT\r\n")) {
					System.out.println(str.length() + "byte만큼 썻습니다.");
					break;
				}
				os.write(str.getBytes()); // 읽어들인 문자 str의 길이 getBytes만큼 써주세요.
				System.out.println(str);
			} // while End
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
