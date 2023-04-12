package homework;

/**
 * @author KOSA 월급
 */
public class Regular extends Employee {
	private double salary;
	private String rank;

	public Regular() {
		super();
	}

	public Regular(String bno, String name, String dept, String phone, String rank) {
		super(bno, name, dept, phone);
		this.rank = rank;
		initSalary();
	}

	private void initSalary() {
		switch (rank) {
		case "사원":
			salary = 3200;
			break;
		case "주임":
			salary = 5200;
			break;
		case "대리":
			salary = 8200;
			break;
		case "부장":
			salary = 10200;
			break;
		default:
			break;
		}
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return super.toString() + " 급여=" + salary + " 만원";
	}

}
