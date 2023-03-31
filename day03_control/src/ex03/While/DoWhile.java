package ex03.While;

public class DoWhile {
	public static void main(String[] args) {
		int a = 1, b = 2;
		do {
			b=2;
			do {
				System.out.printf("%d * %d = %d\t", b, a, a * b);
				b++;
			} while (b <= 9);
			System.out.println();
			a++;
		} while (a <= 9);
	}
}

//public class DoWhile {
//	public static void main(String[] args) {
//		int a = 1, b = 1;
//		do {
//			b=1;
//			do {
//				System.out.print(b+"\t");
//				b++;
//			} while (b <= 3);
//			System.out.println();
//			a++;
//		} while (a <= 2);
//	}
//}

//public class DoWhile {
//	public static void main(String[] args) {
//		int cnt = 0;
//		do {
//			cnt++;
//			System.out.println(cnt);
//		} while (cnt < 10);
//	}
//}
