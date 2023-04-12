package ex03.multimplement;

import ex02.Interface.Shape;
import ex02.Interface.IDraw;

public class MultiClass extends Shape implements Test, IDraw {
	
	private int num;

	public void disp() {
		System.out.println("MultiClass Method");
	}

	@Override
	public void draw() {
		System.out.println("IDraw interface");
	}

	@Override
	public double calc(double x) {
		System.out.println("shape abstract class");
		return 5.5;
	}

	@Override
	public void show(String name) {
		System.out.println("shape abstract class");
	}

	@Override
	public void testView() {
		System.out.println("test interface");
	}

}
