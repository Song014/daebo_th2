package ex02.method;

public class MainEntry {
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("using error");
			return;
		}
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

		String s1 = args[0];
		String s2 = args[1];

		System.out.println("==================================");
		System.out.println(s1 + " " + s2);

		System.out.println("==================================");
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
	}
}

