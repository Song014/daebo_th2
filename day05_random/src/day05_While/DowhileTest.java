package day05_While;

import java.util.Scanner;

public class DowhileTest {
	public static void main(String[] args) {
		String name;
	      int kor, eng, com, total;
	      double everg;
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("이름을 입력해 주세요 : ");
	      name = sc.next();
	      
	      System.out.println("국어, 영어, 전산 순으로 점수를 입력해주세요 : ");
	      kor = sc.nextInt();
	      eng = sc.nextInt();
	      com = sc.nextInt();
	      
	      total = kor + eng + com;
	      everg = (double)total/3;
	      
	      System.out.println(name + "님의 성적표***************\n" + "국어 : " + kor + ", 영어 : " 
	                     + eng + ", 전산 : " + com + "\n총점 : " + total + ", 평균 : " + everg);
	      
	      sc.close();
	      

//		int su;
//		char grade;
//		
//		do {
//			System.out.println("당신의 점수 입력 요망!");
//			su = new Scanner(System.in).nextInt();
//			
//		} while (su < 0 || su>=100);
//		
//		switch(su/10) {
//		case 10:
//		case 9: grade = 'A'; break;
//		case 8: grade = 'A'; break;
//		case 7: grade = 'A'; break;
//		case 6: grade = 'A'; break;
//		default : grade = 'A'; break;
//			
//		}
//		
//		System.out.printf("\n당신의 점수 %d ==> %c학점",su,grade);
//			
	}
}
