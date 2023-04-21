package quiz.bmi;

import java.io.*;
import java.util.*;

public class BmiController {
	private String name = null;
	private String result = null;
	private double bmi = 0.0;
	
	private final File f = new File("bmi.txt");
	private BufferedReader br;
	
	private List<BmiCalc> list = new ArrayList<>();
	private Map<String, Object> bcalc = new HashMap<>();
	

	public BmiController(BufferedReader br) {
		super();
		this.br = br;
	}

	public void fileRead() throws Exception {

		FileInputStream fis = null;
		ObjectInputStream bis = null;

		try {
			fis = new FileInputStream(f);
			int i = 1;
			System.out.println("번호 이름\t측정 결과\tBMI 지수");
			while (true) {
				bis = new ObjectInputStream(fis);
				name = (String) bis.readObject();
				result = (String) bis.readObject();
				bmi = (double) bis.readObject();
				System.out.printf("%d번 %s\t%s\t\t%.1f\r\n", i++, name, result, bmi);
			}

		} catch (EOFException e) {
			System.out.println("Success Load File!");
		} finally {
			bis.close();
		}
	}

	public void fileWrite(int index) throws IOException {

		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(f, true);
			oos = new ObjectOutputStream(fos);

			bcalc = list.get(index - 1).calc();
			name = (String) bcalc.get("name");
			result = (String) bcalc.get("result");
			bmi = (double) bcalc.get("bmi");

			oos.writeObject(name);
			oos.writeObject(result);
			oos.writeObject(bmi);

			System.out.println("bmi.txt save!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
		}
	}

	public Boolean view() {
		if (!list.isEmpty()) {
			System.out.println("검사 기록을 출력합니다.");
			System.out.println("번호 이름\t측정 결과\tBMI 지수");
			for (int i = 0; i < list.size(); i++) {
				bcalc = list.get(i).calc();
				System.out.printf("%d번 %s\t%s\t\t%.1f\n", i + 1, bcalc.get("name"), bcalc.get("result"), bcalc.get("bmi"));
			}
			return true;
		} else {
			System.out.println("추가된 사용자가 없습니다.");
			return false;
		}
	}

	public void update(int index) throws IOException {
		System.out.println("수정할 index 번호를 입력하세요 이름만 수정 가능합니다.");
		if (index > 0) {
			System.out.println("변경하실 이름을 입력하세요");
			list.get(index - 1).setName(br.readLine());
		} else
			System.out.println("잘못 입력하셧습니다.");
	}

	public void add(String name, int height, int weight, Boolean gender) {
		list.add(new BmiCalc(name, height, weight, gender));
	}

	public void remove(int index) {
		if (index > 0)
			list.remove(index - 1);
		else
			System.out.println("잘못 입력하셧습니다.");
	}
}
