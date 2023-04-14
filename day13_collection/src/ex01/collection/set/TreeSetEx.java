package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();
		
		int[] score = {85,95,50,35,45,65,10,65,100};
		
		for(int n :score) {
			set.add(n);
		}
		
		System.out.println(set);
		System.out.println("50보다 작은 값 : "+set.headSet(50)); // 미만
		System.out.println("50보다 큰 값 :" + set.tailSet(50)); // 포함 이상
	}
}
