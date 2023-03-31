package day05_While;

public class 주말과제1 {
	public static void main(String[] args) {
//		1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5) = ? 35
		int sum =0;
		String str = "";
		for(int i=1;i<=5;i++) { 
			for (int j = 1; j <= i; j++) {
				sum +=j;
				if(j==5) {
					str += j+" = ";
					break;
				}
				str += j+" + ";
			}
		}
		System.out.println(str+""+sum);
	}
}
