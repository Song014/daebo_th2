package ex04.apiObject;

class Point {

}

public class MainEntry { // Object Class 에대
	public static void main(String[] args) {
		Point pt = new Point();
		Point pt1 = new Point();

		System.out.println("class name = " + pt.getClass());
		System.out.println("hash code = " + pt.hashCode());
		System.out.println("Object String = " + pt);
		System.out.println("Object String = " + pt.toString());
		System.out.printf("10진수 주소 : %d\n",0x626b2d4a);
		line();
		System.out.println("pt 와 pt1은 같은 객체인가? "+(pt == pt1 ?"같다":"다르다"));
		line();
		
		System.out.println("class name = " + pt1.getClass());
		System.out.println("hash code = " + pt1.hashCode());
		System.out.println("Object String = " + pt1);
		System.out.println("Object String = " + pt1.toString());
		System.out.printf("10진수 주소 : %d\n",0x7a79be86);
		line();
		
		System.out.println("pt1.toString() : toString()의 의미");
		System.out.println(pt1.getClass().getName()+'@'+Integer.toHexString(pt1.hashCode()));
		
		Point pt2 = new Point();
		
		if(pt.hashCode() == pt.hashCode()) 
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		Point pt3;
		pt3 = pt;
		
		if(pt.hashCode() == pt3.hashCode()) 
			System.out.println("같다");
		else
			System.out.println("다르다");
		line();
			
	}

	private static void line() {
		System.out.println("================================================");
	}
}
