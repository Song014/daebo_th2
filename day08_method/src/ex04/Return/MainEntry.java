package ex04.Return;

public class MainEntry {
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x);
		x*=100;
		
		if(x==500) return; // 제어권을 main으로 넘겨줘서 밑에 출력이 안됨
		
		System.out.println(x);
		System.out.println("여기까지 출려해줘~");
	}
}
