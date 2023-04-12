package homework;

/**
 * @author KOSA 사원 정보
 */
public class Employee {
	private String bno;
	private String name;
	private String dept;
	private String phone;

	public Employee() {
		this.bno = "A000";
		this.name = "관리자";
		this.dept = "관리자";
		this.phone = "000-0000-0000";
	}

	public Employee(String bno, String name, String dept, String phone) {
		super();
		this.bno = bno;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "사원번호=" + bno + ", 이름=" + name + ", 부서=" + dept + ", 번호=" + phone;
	}
}
