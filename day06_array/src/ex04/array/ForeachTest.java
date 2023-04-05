package ex04.array;

import java.util.Random;

public class ForeachTest {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=random.nextInt(45+1);
		}
		
		int hd=0;
		for (int i : arr) {
			System.out.println(i);
			hd++;
			if(hd==3) break;
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+"\t");
		}
	}
}
