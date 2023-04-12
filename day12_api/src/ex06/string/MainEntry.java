package ex06.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "Hello";
		System.out.printf("str : %s", str);

		char datap[] = { 'a', 'b', 'c' };
		str = new String(datap);
		System.out.printf("str : %s", str);
		System.out.println("kbs");

		String msg = "cdefasd";
		System.out.printf("korea $s", msg);
		System.out.println(msg);

		msg = msg.concat(" korea");
		System.out.println(msg);

		String str2 = "abcdef".substring(2, 5); // 상한값 포함 하한값 미포함
		System.out.println(str2);
	}
}
