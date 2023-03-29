package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		int su = 12345;
		// 시 : 분 : 초
		int hour = su/3600;
		int h_na = su%3600;
		int min = h_na/60;
		int sec = su%60;
		
		System.out.println(hour+":"+min+":"+sec);
	}
}
