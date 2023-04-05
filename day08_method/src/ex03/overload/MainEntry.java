package ex03.overload;

public class MainEntry {
	public static void main(String[] args) {
		plus(1);
		plus(3,2);
		plus(3,"송");
		line(10, "#@#");
		plus(3.0);
		line(20, "#@#!@@#$!$!#@$@#");
	}

	private static void line(int n,String ch) {
		for(int i=0;i<n;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

	private static void plus(int x) {
		System.out.println(x+100);
	}
	private static void plus(int x,int y) {
		System.out.println(x+y+100);
	}
	private static void plus(int x,String name) {
		System.out.println(name+x+100);
	}
	private static void plus(double x) {
		System.out.println(x+100);
	}
}

// 성적 처리
// 입력받는 함수 따로
// 출력함수 따로
// 총점_평균 하나로
// 학점