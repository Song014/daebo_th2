package quiz;

public class Sawoen {
	private int bno;
	private int sal;
	private String name;
	private String job;
	private String dept;
	private String phone;

	public Sawoen() {
	}

	public Sawoen(int bno, String name, String phone) {
		this(bno,name,"신입","미정",30,phone);
	}

	public Sawoen(int bno, String name, String job, String dept, int sal, String phone) {
		super();
		this.bno = bno;
		this.name = name;
		this.job = job;
		this.dept = dept;
		this.sal = sal;
		this.phone = phone;
	}

	public int getEmpNo() {
		return bno;
	}

	public void setEmpNo(int bno) {
		this.bno = bno;
	}

	public String geteName() {
		return name;
	}

	public void seteName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "사번=" + bno + ", 이름=" + name + ", 직급=" + job + ",\n부서=" + dept + ", 월급=" + sal
				+ ", 번호=" + phone;
	}

}
