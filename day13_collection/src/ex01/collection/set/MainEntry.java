package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// set 순서 X 중복 X
public class MainEntry {
	public static void main(String[] args) {
		Set<String> hash = new HashSet<>();
		Set<Object> tree = new TreeSet<>();
		hash.add("키보드");
		hash.add("마우스");
		hash.add("컵");
		hash.add("볼펜");
		hash.add("키보드");
		
		System.out.println(hash); // [컵, 볼펜, 키보드, 마우스] 중복값 안들어감
		System.out.println(hash.size());// 4
		
//		Set<int> hash = new HashSet<>(); // ReferenceType 타입파라미터에는 레퍼런스형 타입만 넣을 수 있다
		Set<Integer> hs2 = new HashSet<>();
		
		hs2.add(100);
		hs2.add(1);
		hs2.add(10);
		hs2.add(23);
//		hs2.add("String");
		
		System.out.println(hs2);
		
		HashSet hs3 = new HashSet<>();
		
		hs3.add(10.0);
		hs3.add(1);
		hs3.add(10);
		hs3.add(23);
		hs3.add("String");
		
		System.out.println(hs3);
		
		Iterator<String> it = hash.iterator(); // set은 혼자 꺼낼수없어 Iterator으 도움을 받아야하고 
		while(it.hasNext()) { // 다음 요소가 있다면 1씩 증가
			System.out.println(it.next()); // 요소 꺼내와 출력
		}
		
		
	}
}
