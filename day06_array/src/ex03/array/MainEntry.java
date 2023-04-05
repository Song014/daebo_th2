package ex03.array;

import java.util.Arrays;

public class MainEntry {
	public static void main(String[] args) {
		//  초기화 방법 1
		int[][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		//2 
		int[][] arr2= {{3,2,1},{6,5,4}};
		
		
		int[][][] arr3= {{{3,2,1},{6,5,4}},{{},{}}};
		System.out.println(Arrays.toString(arr[0])+Arrays.toString(arr3[0][0]));
		
		for(int i=0; i<arr.length;i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("배열의 행의 크기"+arr.length);
		System.out.println("배열의 열 크기"+ arr[0].length);
	}
}
