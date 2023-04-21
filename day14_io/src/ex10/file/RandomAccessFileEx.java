package ex10.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws IOException {
		
//		RandomAccessFile raf = new RandomAccessFile("sawon.txt","rw" );
		RandomAccessFile raf = new RandomAccessFile("C:\\daebo_th2\\1_Java\\workspace\\day14_api\\sawon.txt","r" );
		
		for(int i=0;i<=10;i++) {
		raf.seek(i*100);
//		String str = "네";
//		raf.writeUTF(str);
//		raf.writeInt(i);
		}
		for(int i=0;i<=10;i++) {
			raf.seek(i*100);
//			System.out.println(raf.readInt());
			System.out.println(raf.readUTF());
		}
		
		System.out.println("String print success");
		raf.close();
	}
}
