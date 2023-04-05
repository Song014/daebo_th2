package ex05.sort;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 9, 6, 7, 3, 5 };
		int selectedIdx, temp;

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length-1; i++) {
			selectedIdx = i;
			System.out.print((i + 1) + ": ");
			int cnt = 0;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[selectedIdx] > arr[j]) {
					selectedIdx = j;
				}
				cnt++;
			}
			temp = arr[i];
			arr[i] = arr[selectedIdx];
			arr[selectedIdx] = temp;
			System.out.printf("최소 값 = %d\n",arr[i]);
			System.out.println(Arrays.toString(arr));
		}
	}
}

//public class SelectionSort {
//	public static void main(String[] args) {
//		int[] arr = {  0,7, 3, 5, 2, 8 };
//		int selectedIdx, temp;
//
//		System.out.println("sort전 출력: ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + "\t");
//		}
//		System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			System.out.print(arr[i] + "\t");
//		}
//	}
//}

//public static void main(String[] args) {
//	int[] arr = {7,3,5,2,8}; 
//	int selectedIdx, temp;
//
//	System.out.println(Arrays.toString(arr));
//	
//	for (int i = 0; i < arr.length-1; i++) { // 1
//		System.out.print((i + 1) + ": ");
//		selectedIdx = i;
//		int cnt = 0;
//		for (int j = i; j < arr.length; j++) {
//			if (arr[selectedIdx] > arr[j]) {
//				selectedIdx = j;
//			}
//			cnt++;
//		}
//		temp = arr[i];
//		arr[i] = arr[selectedIdx];
//		arr[selectedIdx] = temp;
//		System.out.printf("최소 값 = %d\n",arr[i]);
//		System.out.println(Arrays.toString(arr));
//	}
//}