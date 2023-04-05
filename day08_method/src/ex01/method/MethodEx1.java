package ex01.method;

public class MethodEx1 {
	public static void main(String[] args) {
		System.out.println(show());
		int val = show();
		System.out.println(val);

		int val2 = max(30,50,100,120,111);
		System.out.println(val2);
	}

	private static int max(int ... i) {
		
		int max =0;
		for(int n : i) {
			if(n>max) max = n;
		}
		
		return max;
	}

	private static int show() {

		return 20;
	}
}
