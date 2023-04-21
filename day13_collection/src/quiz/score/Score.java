package quiz.score;

public class Score {
	private int kor;
	private int eng;
	private int com;
	private int total;
	private int rank;
	private char grade;
	private double avg;

	public Score(int kor, int eng, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		setTotal();
		setAvg();
		setGrade();
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getCom() {
		return com;
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

	// 총점 , 평균, 학점, 석차
	private void setTotal() {
		this.total = kor + eng + com;
	}

	private void setAvg() {
		this.avg = (double) total / 3;
	}

	public void setGrade() {
		// 총점 학점 평점
		for (int i = 0; i < 3; i++) {
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
	}

	@Override
	public String toString() {
		return String.format("국어 = %d 영어 = %d 전산 = %d 총점 = %d 평균 = %.3f 학점 = %c",kor,eng,com,total,avg,grade);
	}
}
