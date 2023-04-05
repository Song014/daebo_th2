package ex05.sort;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] arr = {  7, 3, 5, 2, 8 };
		System.out.println("sort전 출력: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		Arrays.sort(arr); // 메모리상 
		System.out.println("오름차 순 sort전 출력: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("내림차 순  sort후 출력: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
}
