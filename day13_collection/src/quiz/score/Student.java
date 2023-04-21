package quiz.score;

public class Student {
	private int id;
	private String name;
	private Score score;
	
	public Student(int id,String name, int kor, int eng, int com) {
		super();
		this.id = id;
		this.name = name;
		this.score = new Score(kor, eng, com);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "name=" + name + ", score=" + score;
	}

}
