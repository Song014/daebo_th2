package ex05.filecopy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UriCopy {
	public static void main(String[] args) throws IOException {
			URL url = new URL("https://i.pinimg.com/474x/d9/23/1d/d9231dd1faf237fc69a6e4d5f6723d05.jpg");
			
			// 읽기
			InputStream is = url.openStream();
			
			// 쓰기
			OutputStream os = new FileOutputStream("wow.jpg");

			long start = System.currentTimeMillis();

			byte[] buffer = new byte[1024*8]; // 데이터를 한번에 담아 보내는 도구

			while (true) {
				int inputData = is.read(buffer); // 버퍼크기만큼 읽기
				if (inputData == -1)
					break;
				os.write(buffer, 0, inputData); // b- 자료. off- 데이터의 시작 오프셋. len- 쓸 바이트 수.
			}

			long end = System.currentTimeMillis();
			System.out.println("작업 시간 = " + (end - start) + "ms");

			os.close();
			is.close();
			System.out.println("Copy Success!!!");
	}
}


// https://i.pinimg.com/474x/d9/23/1d/d9231dd1faf237fc69a6e4d5f6723d05.jpg