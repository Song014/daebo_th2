package ex03.For;

public class ForEx2 {
	public static void main(String[] args) {
		
		int a=1,b=1;
		
		
		for(a=0,b=0;a<11;a++,b--) { // 초기값 ,증감식 2개씩 가능 조건은 하나만
			System.out.print(a+" ");
			System.out.print(b+"\n");
		}
		
//		for(;a<4;a++) { //이미 선언되어있다면 생략가능
//			System.out.println(a);
//		}
		
//		for(;a<4;) { //이미 선언되어있다면 초기값과 증감식은 생략 가능
//			System.out.println(a);
//			a++;
//		}
		
//		for(;;) { //무한 루
//			System.out.println(a);
//			a++;
//			
//			// 무한 루프시 탈출구문
//			if(a>10000) {
//				break;
//			}
//		}
		
		
		
	}
}
