package ex05.filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy { // exe 같은 파일들 복사
	public static void main(String[] args) {
		File src = new File("C:\\Windows\\explorer.exe"); // 절대경로
		File target = new File("C:\\daebo_th2\\giseok\\교수님 자료\\1_Java\\explorerCopy.exe");

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		try {
			fis = new FileInputStream(src); // 파일 입력 바이트스트림
			fos = new FileOutputStream(target); // 파일 출력 바이트스트림
			bis = new BufferedInputStream(fis); // 파일 입력스트림
			bos = new BufferedOutputStream(fos); // 파일 출력스트림

			while ((c = bis.read()) != -1) {
				bos.write((char) c);

			}
			System.out.println("파일 복사 성공");
			
			bos.close();
			bis.close();
			fos.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
