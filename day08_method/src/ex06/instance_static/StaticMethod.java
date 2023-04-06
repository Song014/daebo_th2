package ex06.instance_static;

class A{
	int x,y;
	
	public A(int i, int j) {
		this.x = i;
		this.y = j;
		
		System.out.println("생성자 "+x+" "+y);
	}
	
	public void setData1(int x,int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("일반 메소드"+x+" "+y);
	}
	
	public void getData() {
		System.out.println("값 바뀜"+ x+" "+y);
	}

	public static void setData2(int x,int y) {
//		this.x = x; 사용 불가
//		this.y = y; 사용 불가
		
		System.out.println("static 메소드"+x+" "+y);
	}
}

public class StaticMethod {
	
	public static void main(String[] args) {
		A a = new A(3,2); // 객체 생성 메모리 할당 
		a.setData1(5, 1); // 객체 메소드
		a.getData();
		A.setData2(1, 3); // 클래스 메소드
	}
}

