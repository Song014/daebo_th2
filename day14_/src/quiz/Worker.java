package quiz;

public class Worker extends Person {
	private String empId; // 회사 사번
	private String workName; // 직장명
	private int career; // 경력 년수
	
	public Worker(String name, int age, char gender, String empId, String workName, int career) {
		super(name, age, gender);
		this.empId = empId;
		this.workName = workName;
		this.career = career;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	@Override
	public String toString() {
		return "Worker [empId=" + empId + ", workName=" + workName + ", career=" + career + "]";
	}
}