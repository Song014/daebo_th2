package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happygiseok";
		String s2 = "SEOUL";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s2.replace("EO", "korea")); // 바꿀 문자, 바뀔 문자
		System.out.println(s2);
		s2 = s2.replace("EO", "korea");
		System.out.println(s2);
		System.out.println("============================");
		s1 = s1 + s2;
//		s1 = s1.concat(s2);	 // 문자열 결합
		System.out.println(s1);
		System.out.println("============================");
		
		String s3 = new String("      ab     cd    ");
		System.out.println(s3);
		System.out.println(s3.length()); // 문자열 길이
		
		s3 = s3.trim(); // 공백 제거 가운데 공백은 제거 X
		System.out.println(s3);
		s3 = s3.replace(" ", "");
		System.out.println(s3); // replace 를 사용하면 모든 공백 제거 가능
		
		String s4 = new String("ab/cdfgh/123123/kwadasd/13123123");
		String[] s5 = s4.split("/");
		int cnt = 1;
		for(String str :s5)
			System.out.printf("분리된 문자열 %d : %s\n",cnt++,str);
		System.out.println("============================");
		String s6 = "123-451123-12314";
		String[] s7 = s6.split("-");
		
		for(String str :s7)
			System.out.printf("분리된 문자열 %d : %s\n",cnt++,str);
		System.out.println("============================");
		
		String s8 = "1231kklfanfsanfdaf a dasjjna lasdj nfaklsdjnfalsj";
		char ch = s8.charAt(5);
		System.out.println(ch);
		
		s8 = s8.substring(5,7);
		System.out.println(s8);
		System.out.println("============================");
		System.out.printf("소문자로 출력 : toLowerCase %s\n",s2.toLowerCase());
		System.out.printf("대문자로 출력 : toUpperCase %s\n",s2.toUpperCase());
		
		
		char[] ch2 = s1.toCharArray(); // 문자열 문자로 분리 가능
		for(char c : ch2)
			System.out.print(c+"\t");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
