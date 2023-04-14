package ex02.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List list = new ArrayList(10);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(0);
		System.out.println(list);
		System.out.println(list.size());

		List list2 = new ArrayList<>(list.subList(1, 4)); // subString이랑 똑같음
		print(list, list2);

		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);

		System.out.println("list.containsAll(list2) : " + list.containsAll(list2)); // 모든값 비교

		for (int i = list.size() - 1; i < 0; i--) {
			if (list.contains(list2.get(i))) {
				list2.remove(i);
			}
		}

		print(list, list2);
	}

	private static void print(List<Object> list, List<Object> list2) {
		System.out.println("list = " + list);
		System.out.println("list2 = " + list2);
		System.out.println();
	}

}
