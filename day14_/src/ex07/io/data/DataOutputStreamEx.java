package ex07.io.data;

import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) throws IOException {

		File file = new File("test.txt");

		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeChar(65); // ASCII
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(8888888);
		dos.writeFloat(12.34f);
		dos.writeDouble(8.8);
		dos.flush();

		System.out.println("test.txt 파일에" + dos.size() + "byte save");
		dos.close();

	}
}
