package ex05.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {  7, 3, 5, 2, 8 };
		int selectedIdx, temp;

		System.out.println("sort전 출력: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.print(arr[i] + "\t");
		}
	}
}
