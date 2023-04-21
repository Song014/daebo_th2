package ex04.thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GraphicThread extends JFrame implements Runnable {// 이미 상속을 받았다면 runnable을 사용해서 쓰레드 사용

	int x, y, num;
	Color color;
	Random random;
	
	
	public GraphicThread(int num){
		this.num = num;
		color = Color.darkGray;
		random = new Random();
		setSize(500,400); // 프레임 (화면)크기 - 너비, 높이
		setVisible(true); // 화면 보여주기
		
		setLocation(600, 300);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
//		g.fillRect(x, y, 10, 10);
		g.fillOval(x, y, 50, 50);
	}

	@Override
	public void run() {// 쓰레드 실행부(구현부)

		Rectangle rect = getBounds();

		for(int i=0;i<num;i++) {
			x=random.nextInt(rect.width);
			y=random.nextInt(rect.height);
			
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	} // RUN END
	
	

}
