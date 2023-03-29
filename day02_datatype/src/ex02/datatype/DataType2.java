package ex02.datatype;

public class DataType2 {
	// 모든 자료형은 자신의 법위를 벗어나지 않음
	public static void main(String[] args) {
		short sh = 32767; // -32,768 ~ 32767 
		int num = 50000; //+-21억

		num = sh; //int(4byte) <- short(2byte) 작은자료형에서 큰자료형은 자동형변환 묵시적형변환
		System.out.println(sh+ " : "+num);
		
//		num = -32769;
		num = 32770;
		sh = (short)num; // 큰자료형에서 작은자료형은 명시적형변화 (자료형)변수 하지만 범위안에서만 표현됨
		System.out.println(sh + " : "+ num);
	}
}
// 한줄주석
//* 여러줄 */
/** javadoc */