package ex05.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfoMation {
	public static void main(String[] args) throws IOException {
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		
		System.in.read(fileName);
		strName = new String(fileName).trim();
		// 상대경로 memo.txt
		// 절대경로 C:\경로\memo.txt
		file = new File(strName);
		
		System.out.println("절대경로 : "+file.getAbsolutePath());
		System.out.println("표준경로 : "+file.getCanonicalPath());
		System.out.println("최종 수정일 : "+ new Date(file.lastModified()));
		System.out.println("파일크기: "+file.length());
		System.out.println("읽기속성 : "+file.canRead());
		System.out.println("쓰기속성 : "+file.canWrite());
		System.out.println("파일경로 : "+file.getPath()); // 절대경로
		System.out.println("숨김속성 : "+file.isHidden());
	}
}
