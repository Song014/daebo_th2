package quiz.video;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Video {
	private String title;
	private String category;
	private Boolean lend;
	private String lendName;
	private Date lendDate;

	public Video( String title, String category) {
		super();
		this.title = title;
		this.category = category;
		this.lend = false;
		this.lendDate = new Date();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getLend() {
		return lend;
	}

	public void setLend(Boolean lend) {
		this.lend = lend;
	}
	
	

	public String getLendName() {
		return lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public String getLendDate() {
		SimpleDateFormat fom = new SimpleDateFormat("yyyy년 MM월 dd일");
		String date = "----년 --월 --일";
		if(lend)  date = fom.format(lendDate);
		return date;
	}

	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	@Override
	public String toString() {
		String lendstr = "대여가능";
		if(lend) lendstr = "대여중";
		return "[타이틀: " + title + ", 카테고리: " + category + ", 대여여부: " + lendstr + ", 대여자: " + lendName
				+ ", 대여일: " + getLendDate()+"]";
	}
}
