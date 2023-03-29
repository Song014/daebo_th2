///*
package ex03.operator;

import java.util.Scanner;

// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 삼항 연산자
		int x,y,result;
		Scanner sc = new Scanner(System.in);
//		System.out.println("integer date 2 input : ");
//		x = sc.nextInt();
//		y = sc.nextInt();
		
//		if(x>y) result= x;
//		else result = y;
		
//		result = x>y ? x:y;
		
//		System.out.println("max = "+ result);
		
		String str = null;
		System.out.println("year = ");
		int year = sc.nextInt();
		
		str = (year == 2000)? "맞네":"틀리네";
		
		System.out.println(year + "년도 "+str);
		
	}
}
//*/

/*
package ex03.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//논리연산자 : and 2진(&)10진(&&) or2(|)10(||) not(^|) (!|) 2진 값결과 10진 Boolean
		
		int num1 = 4;
		int num2 = 7;
		boolean flag = false;
		
		//2진 값
		System.out.println(num1&num2); //and
		System.out.println(num1|num2); //or
		System.out.println(num1^num2); //xor
		
		flag = (num1<num2) && (num1<num2);
		flag = (num1>num2) && (num1<num2); // &&연산일때 앞의 값이 거짓이면 뒤는 수행X
		System.out.println(flag);
		
		flag = (num1<num2) || (num1<num2);
		flag = (num1>num2) || (num1<num2); // ||연산일떄 앞의 값이 참이면 뒤는 수행X
		System.out.println(flag);

		System.out.println(!flag);
		
	}
}
//*/

