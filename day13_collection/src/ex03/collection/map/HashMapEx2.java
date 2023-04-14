package ex03.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("기석", new Integer(90));
		map.put("승현", new Integer(80));
		map.put("승원", new Integer(70));
		map.put("혁진", new Integer(50));
		map.put("지연", new Integer(60));

		Set set = map.entrySet();
//		System.out.println(set);
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println("name = " + e.getKey());
			System.out.println("score = " + e.getValue());
		}

		set = map.keySet();
		System.out.println("응시 명단 " + set);

		Collection values = map.values();
		it = values.iterator();
		int total = 0;
		while (it.hasNext()) {
			Integer i = (Integer) it.next(); // next 리턴 Object라서 다운캐스팅
			total += i;
		}
		System.out.println("총점 "+total);
		System.out.println("평균 "+(double)total/set.size());
		System.out.println("최고점수 "+Collections.max(values));
		System.out.println("최고점수 "+Collections.min(values));
	}
}
