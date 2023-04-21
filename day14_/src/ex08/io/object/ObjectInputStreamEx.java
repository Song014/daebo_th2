package ex08.io.object;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		InputStream is = new FileInputStream(br.readLine());
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Grade dto = (Grade) ois.readObject();
		
		System.out.println(dto);
	}
}
// grade.dat