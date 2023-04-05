package ex01.method;

public class MethodEx2 {
	public static void main(String[] args) {
		String name = name(1,"송기석");
		System.out.println(name);
		System.out.println(display(10, "*"));
		System.out.println(display(10, "&"));
	}

	private static String name(int n, String name) {
		System.out.println("num = "+n);
		return name;
	}
	private static String display(int n, String name) {
		
		for(int i = 0;i<n;i++) 
			System.out.print(name+"\t");
		
		return name;
	}
}
