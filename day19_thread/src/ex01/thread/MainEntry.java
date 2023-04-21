package ex01.thread;

public class MainEntry {
	public static void main(String[] args) {
//		Thread t1 = new Thread("t1");
		UserThread t1 = new UserThread();
		Thread t2 = new UserThread();
		Thread t3 = new UserThread();
		
		t1.setPriority(Thread.MIN_PRIORITY); // 우선순위 1
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); // 10
		
		
//		t1.run(); // thread라고 할 수 없음 
		t1.start();
		t2.start();
		t3.start();
	}
}
