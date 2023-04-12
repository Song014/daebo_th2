package ex06.string;

import java.io.IOException;

public class StringMain {
	public static void main(String[] args) throws IOException {
		int x = 3, y = 5;
		System.out.printf("x = %d, y = %d\n", x, y);
		x = y;
		System.out.printf("x = %d, y = %d\n\n", x, y);

		String str1 = "korea";
		String str2 = "happy";
		System.out.printf("str1 = %s, str2 = %s\n", str1, str2);
		System.out.printf("hashcode1 : %s, hashcode2 : %s\n\n", str1.hashCode(), str2.hashCode());

		str1 = str2;
		System.out.printf("str1 = %s, str2 = %s\n", str1, str2);
		System.out.printf("hashcode : %s, hashcode2 : %s\n\n", str1.hashCode(), str2.hashCode());

		str2 = "seoul";
		System.out.printf("str1 = %s, str2 = %s\n", str1, str2);
		System.out.printf("hashcode : %s, hashcode2 : %s\n\n", str1.hashCode(), str2.hashCode());

		str2 = "korea";
		System.out.printf("str1 = %s, str2 = %s\n", str1, str2);
		System.out.printf("hashcode : %s, hashcode2 : %s\n\n", str1.hashCode(), str2.hashCode());

		String str3 = "korea";
		System.out.printf("str2 = %s, str3 = %s\n", str2, str3);
		System.out.printf("hashcode : %s, hashcode2 : %s\n\n", str2.hashCode(), str3.hashCode());

		str3 = "giseok";
		System.out.printf("str2 = %s, str3 = %s\n", str2, str3);
		System.out.printf("hashcode : %s, hashcode2 : %s\n\n", str2.hashCode(), str3.hashCode());
	}
}
