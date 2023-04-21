package ex03.thread;

public class MainEntry {
	public static void main(String[] args) throws InterruptedException {
		long id = Thread.currentThread().getId(); // 쓰레드 ID long
		String name = Thread.currentThread().getName(); // 쓰레드 이름

//		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.State state = Thread.currentThread().getState(); // 쓰레드 상태

		Thread.sleep(1000);
		Thread.currentThread();

		int priority = Thread.currentThread().getPriority();

		System.out.printf(
				"현재 Thread ID = %d\n" + "현재 Thread NAME = %s\n" + "현재 Thread Priority = %d\n" + "현재 THread State = %s\n",
				id, name, priority, state);
	}
}
