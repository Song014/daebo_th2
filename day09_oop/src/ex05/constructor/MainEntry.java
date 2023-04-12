package ex05.constructor;

public class MainEntry {
	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV("red",5);
		
		System.out.println(tv1);
		System.out.println(tv2);
		
		tv1.setColor("black");
		tv1.setChannel(10);
		
		System.out.println(tv1);
		
	}
}
 	