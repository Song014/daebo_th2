package ex01.thread;

public class UserThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if(i==3) {
				try {
					sleep(1000); // 1/1000 1ch , 예외 발생
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
			}
			System.out.println(i);
		}
	}
}
