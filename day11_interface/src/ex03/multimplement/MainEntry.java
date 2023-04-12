package ex03.multimplement;

import ex02.Interface.IDraw;
import ex02.Interface.Shape;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 자기자신
		MultiClass m = new MultiClass();
		
		// 2. 부모
		Shape s = new MultiClass();
		s.show("도형");
		s.view();
		
		System.out.println();
		Test t= new MultiClass();
		t.testView();
		System.out.println(t.str);
		
		IDraw i = new MultiClass();
		i.draw();
		System.out.println(i.SU);
		
	}
}
