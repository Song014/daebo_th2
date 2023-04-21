package quiz;

public class Student extends Person {
	private String studentId; // 학번
	private String grade; // 학년
	private Boolean experience; // 튜터링 경험여부

	public Student(String name, int age, char gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Boolean getExperience() {
		return experience;
	}

	public void setExperience(Boolean experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", grade=" + grade + ", experience=" + experience + "]";
	}
}
/*
 * 학생
 * 
 * 
 */