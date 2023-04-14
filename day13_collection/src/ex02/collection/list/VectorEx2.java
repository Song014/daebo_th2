package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector<Object> v = new Vector<>(3, 5);

		v.addElement("자바"); // String
		v.addElement(new Double(3.4)); // double
		v.addElement(date); // object

		System.out.println("=====================================");
		System.out.printf("size : %d, capacity : %d\n", v.size(), v.capacity());

		for (i = 0; i < 10; i++)
			v.addElement(new Integer(i));

		System.out.printf("size : %d, capacity : %d\n", v.size(), v.capacity());

		Enumeration<Object> enu = v.elements();
		while (enu.hasMoreElements())
			System.out.print(enu.nextElement() + " ");

		System.out.println("객체 내용 포함 확인");
		if (v.contains("자바"))
			System.out.println("있");
		else
			System.out.println("없");

		System.out.println("10.2 객체 위치는?" + v.indexOf(new Double(3.4)));
		System.out.println("자바미포함");

		v.removeElementAt(v.lastIndexOf(date));
		System.out.printf("size : %d, capacity : %d\n", v.size(), v.capacity());
		System.out.println(v);

		for (i = 0; i < v.size(); i++) {
//			v.removeElementAt(0);
//			v.remove(i);
			v.remove(3.4);
			v.remove("자바");
//			v.removeAllElements();
//			v.clear();
		}
		System.out.printf("size : %d, capacity : %d\n", v.size(), v.capacity());
		System.out.println(v);
		
		for(i=0;i<v.size();i++) {
			System.out.print(v.get(i)+", "); // get을 사용한 요소 꺼내기
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		v.setElementAt("asd", 0); // 임의의 위치에 원하는 객체 담기
		
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement()+", ");
		}
		System.out.println();
		
		v.trimToSize();
		System.out.printf("size : %d, capacity : %d\n", v.size(), v.capacity());
		
		v.setSize(2); // 크기를 강제로 2로 조정
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement()+", ");
		}
		System.out.println();
		System.out.printf("size : %d, capacity : %d\n", v.size(), v.capacity()); // 사이즈는 trimToSize로 조절이 가능하다 setSize로 강제로 조절한다고 줄어들지 않는다
	}
}
