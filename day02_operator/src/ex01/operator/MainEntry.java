package ex01.operator;

// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
//		// 단항연산자 : 증감연산자 ++ --
//		int x = 10, y;
//		y = x++; // 후위 연산 : 대입 먼저 연산 나중
//		y = ++x; // 전위 연산 : 연산 먼저 대입 나중
//		// -- 도 동일
//		x++; 
//		y=x;
//		y = ~x; // 비트 부정 1010 = 0101 = -11  계산법 -(원래값 +1) ==> 출력결과 
//		System.out.println("x = " + x + " y = " + y);
		
		//산술연산자  + - * / % 
		int x = 10, y=20;
		System.out.println(x+" + "+y+" = "+(x+y));
		System.out.println(x+" - "+y+" = "+(x-y));
		System.out.println(x+" * "+y+" = "+(x*y));
		System.out.println(x+" / "+y+" = "+(x/y));
		System.out.println(x+" % "+y+" = "+(x % y));
		System.out.println((3+4)*x);
		
		System.out.println((7/3.));
		System.out.println((7./3.));
		
		
		
		//쉬프트연산자 << >>  >>>
		//관계연산자(비교) > < >= <= != ==
		//논리 연산자 & ^ | && ||
		//삼항 조건? 참:거짓
		//대입 = += -= *= /= %= &= >>= <<= >>>= ^= != |=
	}
}
