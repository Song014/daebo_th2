package ex04.list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		list.addFirst("a"); //헤드
		list.addLast("z"); // 테일
		System.out.println(list);
		list.remove("k"); //  데이타 값으로
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.set(2,"a");
		System.out.println(list);
		list.set(3,list.get(1)+"change");
		System.out.println(list);
		String str1 = (String)list.peek();
		System.out.println("=====================");
		System.out.println(str1);
		System.out.println(list);
		String str2 = (String)list.poll(); // 큐에서 데이터를 꺼내온다
		System.out.println(str2);
		System.out.println(list);
		list.offer("a");
		System.out.println(list);
		String str3 = (String)list.remove();
		System.out.println(str3);
		System.out.println(list);
	}
}
