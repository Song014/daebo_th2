package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 사칙연산 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a ,b;
		char op;
		while (true) {
			System.out.println("(정수) (정수) (연산자) 순으로 입력해주세요.");
			String str = br.readLine();
			st = new StringTokenizer(str);
			a = b = 0;
			op = ' ';
			while(st.hasMoreElements()) {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				op = st.nextToken().charAt(0);
			}
			
			all(a, b, op);
		}
	}

	private static void all(int a, int b, char op) {
		int result = 0;
		try {
			switch (op) {
			case '+':
				result =a + b;
				break;
			case '-':
				result =a - b;
				break;
			case '*':
				result =a * b;
				break;
			case '/':
				result =a / b;
				break;
			case '%':
				result =a % b;
				break;
			default:
				System.out.println("다시 입력하세요");
				return;
			}
		} catch (Exception e) {
			System.out.println("0으론 나눌 수가 없어요");
		} 
		
		System.out.printf("%d %c %d = %d\n\n",a,op,b,result);
	}
}
