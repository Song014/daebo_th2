package homework;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		int[][] arr = new int[3][n];
		
		for(int i=0;i<arr.length-1;i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[2][i] = arr[0][i]+arr[1][i];
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}
