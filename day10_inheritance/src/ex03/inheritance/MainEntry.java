package ex03.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Rect r = new Rect();
		System.out.println(r+"\n");
		
		Rect r1 = new Rect(2,3);
		System.out.println(r1+"\n");
		
		Rect r2 = new Rect(4,2,5,3);
		System.out.println(r2+"\n");
	}
}
