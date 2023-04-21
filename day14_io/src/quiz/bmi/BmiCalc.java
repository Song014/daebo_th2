package quiz.bmi;

import java.util.HashMap;
import java.util.Map;

public class BmiCalc {
	private String name;
	private int height;
	private int weight;
	private Boolean gender; // T 남자 F 여자

	public BmiCalc(String name, int height, int weight, Boolean gender) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Map<String, Object> calc() {
		Map<String, Object> map = new HashMap<>();
		double bmi = 0.0;
		map.put("name", name);
		
		bmi = weight / ((height * 0.01) * 2);
		String result = result(Math.round(bmi * 10) / 10.0);

		map.put("result", result);
		map.put("bmi", bmi);
		
		return map;
	}

	private String result(double bmi) {
		String str = null;
		if (bmi < 18.5) {
			str = "저체중";
		} else if (bmi >= 18.5 && bmi <= 22.9) {
			str = "정상";
		} else if (bmi >= 23.0 && bmi <= 24.9) {
			str = "과체중";
		} else if (bmi >= 25.0) {
			str = "비만";
		}
		return str;
	}

	@Override
	public String toString() {
		return "BmiCalc [height=" + height + ", weight=" + weight + ", gender=" + gender + "]";
	}
}
