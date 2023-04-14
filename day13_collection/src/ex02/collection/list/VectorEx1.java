package ex02.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("length\t/\tcapacity");
//		System.out.println(v.size() + "\t/\t" + v.capacity());

		Vector<Integer> v2 = new Vector<>(3, 4); // 초기용량 증가값
//		System.out.println(v2.size() + "\t/\t" + v2.capacity());
		v2.add(1);
		v2.add(3);
		v2.add(2);
		v2.add(5);
		v2.add(7);
		v2.add(4);
		v2.add(7);
		v2.add(6);
		System.out.println(v2.size() + "\t/\t" + v2.capacity());
//		System.out.println(v2);
		System.out.println("==================iteratrr=======================");
		Iterator<Integer> it = v2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		for(int i=0;i<v2.size();i++) {
			System.out.println(v2.get(i)); // list는 get으로 꺼내기 가능
		}
		System.out.println("===============sort====================");
		Collections.sort(v2);// 정렬
		System.out.println(v2);
		
		System.out.println("=============elementsAt()====================");
		for(int i=0;i<v2.size();i++) {
			Integer num = v2.elementAt(i); // 요소 객체 알아내기
			System.out.print(num+" ");
		}
		System.out.println();
		v2.trimToSize();
		System.out.println(v2.size() + "\t/\t" + v2.capacity());
	}
}