package ex02.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 각자 클래스로 객체 생성
		Circle c = new Circle();
		Rect r = new Rect();
		Triangle t = new Triangle();
		
		c.show("Circle");
		r.show("Rectangle");
		t.show("Triangle");
		
		System.out.println();
		// 2. 추상 클래스를 이용해 객체생성
//		Shape x = new Shape();// 불가능
		Shape c1 = new Circle();
		Shape r1 = new Rect();
		Shape t1 = new Triangle();
		
		c1.show("원");
		r1.show("사각형");
		t1.show("삼각형");
		
		// 3. 
		Shape[] ss = new Shape[3]; // 객체 아님 배열선언 및 생성
//		ss[0] = new Shape();//이게 객체 생성 
		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();
		
		String[] name = {"원","사각형","삼각형"};
		
		System.out.println("========================================");
		for(int i =0; i<ss.length;i++) {
			ss[i].show(name[i]);
		}
		System.out.println("========================================");
		
	}
}
