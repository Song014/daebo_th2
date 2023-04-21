package ex02.runnable;

public class MainEntry {
	public static void main(String[] args) {
//		Runnable u1 = new UserRunnable("u1");
//		
//		Thread t1 = new Thread(u1); // runnable 은 Start 메소드가 없어서 Thread 클래스의 객체생성시 타겟을 넣어줘 start시켜줌
//		t1.start();
		
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		System.out.println(new Thread(new UserRunnable("u3")).getName());
	}
}
