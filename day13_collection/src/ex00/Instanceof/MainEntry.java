package ex00.Instanceof;

class A{
	
}
class B extends A{ }

public class MainEntry {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println("a instanceof A = "+(a instanceof A)); // 앞에있는 녀석을 뒤에있는 녀석으로 바꿀 수 있는지 없는지 True of False
		System.out.println("b instanceof A = "+(b instanceof A));
		System.out.println("a instanceof B = "+(a instanceof B));
		System.out.println("b instanceof B = "+(b instanceof B));
	}
}
