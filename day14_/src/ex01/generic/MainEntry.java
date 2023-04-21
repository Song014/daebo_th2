package ex01.generic;

import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<>();
		String[] str = {"abc","kbs","diroter"};
		t1.set(str); t1.print();
		System.out.println("=================");
		
		GenericEx<Integer> t2 = new GenericEx<>();
		Integer[] num = {1,2,3,4,5,6,7,8};
		t2.set(num); t2.print();
		System.out.println("=================");
		
		GenericEx<Double> t3 = new GenericEx<>();
		Double[] dou = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0};
		t3.set(dou); t3.print();
		System.out.println("=================");
		
		GenericEx<Object> t4 = new GenericEx<>();
		Object[] obj = {1.0,"asd",1,true,'A',new Date()};
		t4.set(obj); t4.print();
		System.out.println("=================");
	}
}
