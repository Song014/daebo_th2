package homework;

public class PartTime extends Employee {
	private int workDay;
	private int pay;

	public PartTime(String bno, String name, String dept, String phone, int workDay, int pay) {
		super(bno, name, dept, phone);
		this.workDay = workDay;
		this.pay = pay;
	}

	@Override
	public String toString() {
		return super.toString() + " 일 급: " + (workDay * pay) + " 만원";
	}
}
