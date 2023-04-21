package ex04.thread;

public class MainEntry {
	public static void main(String[] args) {
		new Thread(new GraphicThread(200)).start();
	}
}
