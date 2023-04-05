package ex01.method;

public class MainEntry {

	public static void main(String[] args) {

		System.out.println("Main Start");
		line(); // 호출
		info("기석", "010-2222-2222", "seoul");
		plus(1, 3, "hello");
		line();
		abs(-9);
		System.out.println("Main End");

	}

	private static void abs(int i) {
		if (i < 0)
			i = -i;
		System.out.println(i);
	}

	private static void plus(int i, int j, String msg) { // 함수 정의
		System.out.println(msg + " hap = " + (i + j));
	}

	private static void line() {
		System.out.println("==============================================================");
	}

	private static void info(String name, String phone, String city) {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(city);
	}

}
