package ex08.io.object;

import java.io.*;

public class ObjectoutPutStreamEx {
	public static void main(String[] args) throws IOException {
		Grade vo = new Grade();
		vo.setSubject("미술");
		vo.setScore(80);
		
		System.out.println(vo);
		OutputStream os =new FileOutputStream("grade.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo);
		oos.close();
		
	}
}
