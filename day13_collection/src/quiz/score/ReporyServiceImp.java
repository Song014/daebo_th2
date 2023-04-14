package quiz.score;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ReporyServiceImp implements ReportService {
	Map<Integer, Student> map = new HashMap<>();
	Student st;
	int id = 0;

	@Override
	public void add(String name, int kor, int eng, int com) {
		st = new Student(++id, name, kor, eng, com);
		map.put(id, st);
	}

	@Override
	public void showList() {
		Set set = map.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.print("id = " + e.getKey());
			System.out.println(" " + e.getValue());
		}
	}

}
