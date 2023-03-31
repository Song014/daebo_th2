package day05_While;

public class 주말과제2 {
	public static void main(String[] args) {
		//(-1) + 2 + (-3) +4+(-5)+ … + (-9) + 10 = ? 5
		// 출력을 위한 문자열 변수, 더하기 위한 변수
		int sum=0;
		String str="";
		
		for (int i = 1; i <= 10; i++) {
			
			if(i%2 != 0) {
				sum += -i;
				str += -i+" + ";
			}else {
				sum += i;
				str += i+" + ";
			}
		}
		System.out.println();
		System.out.print(str);
		System.out.println(sum);
	}
}
