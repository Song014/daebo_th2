package quiz;

import java.util.Scanner;

public class Score {
	private String name;
	private int[] score = new int[3];;
	private int total;
	private char grade;
	private int rank;
	private double avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public int getTotal() {
		return total;
	}

	public char getGrade() {
		return grade;
	}

	public int getRank() {
		return rank;
	}

	public double getAvg() {
		return avg;
	}

	public void input(int n) {
		Scanner sc = new Scanner(System.in);

		System.out.println("================================================");
		System.out.print("\n이름 입력");
		name = sc.next();
		for (int i = 0; i < n; i++) {
			score[i] = (int) (Math.random() * 100 + 1);
		}
		process();
	}

	public void process() {
		// 총점 학점 평점
		for (int i = 0; i < score.length; i++) {
			total += score[i];
			// 평점 구하기 switch 사용
			switch ((int) avg / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
			}
		}
		avg = total / 3.0;
	}
	
	public void disp(int[] rank,int i) {
		
		System.out.println("============" + name + "학생의 성적표=======");
		System.out.printf("국어 : %d 영어 : %d, 전산 : %d\n", score[0], score[1], score[2]);
		System.out.printf("총점 : %d 평균 : %.2f, 평점(학점) : %c, 석차 : %d \n", total, avg, grade,rank[i]);
	}
}