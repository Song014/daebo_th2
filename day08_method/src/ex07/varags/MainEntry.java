package ex07.varags;

public class MainEntry {
	public static void main(String[] args) {
		plus(2, 3);
		plus(200);
		plus(1, 2, 3, 4, 5);
		plus("asd","qwe","zxc");
	}

	private static void plus(int...arr) {
		StringBuilder sb = new StringBuilder();
		int plus = 0;
		for (int n : arr) {
			plus += n;
			sb.append(n + " + ");
		}

		System.out.println(sb.substring(0, sb.length() - 2) + "= " + plus);
	}
	
	private static void plus(String...arr) {
		StringBuilder sb = new StringBuilder();
		String plus = "";
		for (String n : arr) {
			plus += n;
			sb.append(n + " + ");
		}

		System.out.println(sb.substring(0, sb.length() - 2) + "= " + plus);
	}
}

//public class MainEntry {
//	public static void main(String[] args) {
//		sum(1,2,3,4);
//	}
//
//	private static void sum(int ... arr) {
//		StringBuilder sb = new StringBuilder();
//		int sum = 0;
//		for(int n :arr) {
//			sum+=n;
//			sb.append(n+" + ");
//		}
//		System.out.println(sb.substring(0,sb.length()-2)+"= "+sum);
//	}
//	
//	private static void sum(int ... arr) {
//		StringBuilder sb = new StringBuilder();
//		int sum = 0;
//		for(int n :arr) {
//			sum+=n;
//			sb.append(n+" + ");
//		}
//		System.out.println(sb.substring(0,sb.length()-2)+"= "+sum);
//	}
//}