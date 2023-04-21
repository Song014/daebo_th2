package ex05.filecopy;

import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fileName = br.readLine().trim();
		InputStream is = new FileInputStream(fileName);
		OutputStream os = new FileOutputStream("copy2.png");

		long start = System.currentTimeMillis();

		byte[] buffer = new byte[1024*8]; // 데이터를 한번에 담아 보내는 도구

		while (true) {
//			int inputData = is.read(); // data가 없으면 -1
			int inputData = is.read(buffer); // 버퍼크기만큼 읽기
			if (inputData == -1)
				break;
//			os.write(inputData); // 로컬에 저장
			os.write(buffer, 0, inputData); // b- 자료. off- 데이터의 시작 오프셋. len- 쓸 바이트 수.
		}

		long end = System.currentTimeMillis();
		System.out.println("작업 시간 = " + (end - start) + "ms");

		is.close();
		os.close();
		System.out.println("Copy Success!!!");
	}
}

// C:\Users\KOSA\Pictures\Saved Pictures\3차원배열.png
// bit.png