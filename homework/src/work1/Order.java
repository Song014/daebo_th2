package work1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	private SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
	private int bno;
	private String date;
	
	public void orderRegist(Object orderInfo) {
		this.bno = 0;
		this.date = sim.format(new Date());
	}

	public String getDate() {
		date = sim.format(date);
		return date;
	}
	
}
