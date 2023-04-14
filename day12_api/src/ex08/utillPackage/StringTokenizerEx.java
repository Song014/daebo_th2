package ex08.utillPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("사과=10|초코렛=3|샴페인=1","=|",true);
		
		while( st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
			String str = st.nextToken();
			if(str.equals("=")) System.out.print("\t");
			else if(str.equals("|"))System.out.println();
			else System.out.print(str);
		}
	}
}


//public class StringTokenizerEx {
//	public static void main(String[] args) {
//		StringTokenizer st = new StringTokenizer("자바/알고리즘/감자/왕국","/");
//		
//		while( st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
//	}
//}
