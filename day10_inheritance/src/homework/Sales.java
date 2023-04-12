package homework;

/**
 * @author KOSA 커미션 정보
 */
public class Sales extends Regular {
	private double commission = 0.5;

	public Sales() {
		super();
	}

	public Sales(String bno, String name, String dept, String phone, String rank, double commission) {
		super(bno, name, dept, phone, rank);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return super.toString() + " 보너스=" + getSalary() * commission + " 만원";
	}
}
