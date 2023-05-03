package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Score2 {
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

	@Override
	public String toString() {
		return "Score2 [name=" + name + ", score=" + Arrays.toString(score) + ", total=" + total + ", grade=" + grade
				+ ", rank=" + rank + ", avg=" + avg + "]";
	}
}
