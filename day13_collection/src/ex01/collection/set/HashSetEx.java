package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","3","3","4","4","4"}; // 자료형이 다르면 다른 데이터
		Set<Object> set = new HashSet<>();
		
		for(Object o : objArr) {
			set.add(o);
		}
		objArr.equals(objArr);
		
		Iterator<Object> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
