package quiz;

public class Quiz01 {
	public static void main(String[] args) {
//		int pay = 567890;
//		
//		System.out.println("result :");
//		System.out.println("만원 : "+(pay/10000)+"장");
//		System.out.println("천원 : "+((pay/1000)%10) +"장");
//		System.out.println("백원 : "+((pay/100)%10)+"개");
//		System.out.println("십원 : "+((pay/10)%10)+"개");
		
		int pay = 567890;
		int man,chun,back,sip;
		int m_na,ch_na,b_na;
		
		man = pay/10000;		m_na = pay%10000;
		chun = m_na / 1000;		ch_na = m_na%1000;
		back = ch_na / 100;		b_na = ch_na%100;
		sip = b_na / 10;
		
		System.out.println("result :");
		System.out.println("만원 : "+man+"장");
		System.out.println("천원 : "+chun+"장");
		System.out.println("백원 : "+back+"개");
		System.out.println("십원 : "+sip+"개");
	}
	
}
// 1. 변수선언
// 2. 메시지 출력 및 입력
// 3. 처리(계산)
// 4. 결과 출력(화면)