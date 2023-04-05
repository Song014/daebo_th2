package ex04.array;

public class MainEntry {
	public static void main(String[] args) {

		int[] a = new int[30];
		int[][] a2 = new int[2][3]; // 초기화가 되어있지않을때 행 크기 생략 X
		int[][] a3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] a4 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] a5 = { { 0, }, { 0, } }; // 0으로 다채워줘 ',' 콤마 안찍어도 됨

		int[][][] a8 = new int[2][2][3];

		System.out.printf("1차원 배열 길이: %d\n", a.length);
		System.out.printf("2차원 배열 길이: 행[%d] 열[%d]\n", a2.length, a2[0].length);
		System.out.printf("3차원 배열 길이: 면[%d] 행[%d] 열[%d]\n", a8.length, a8[0].length, a8[0][0].length);

		// 임의 적인 데이터를 입력 받아서 배열 데이터 값을 출력하느 프로그램
		for (int i = 0; i < a8.length; i++) {
			for (int j = 0; j < a8[0].length; j++) {
				for (int k = 0; k < a8[0][0].length; k++) {
					a8[i][j][k] = (int) (Math.random() * 100 + 1);
					System.out.print(a8[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

//public class MainEntry {
//	public static void main(String[] args) {

//		int[] arr = new int[100];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random()*100+2);
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + "\t");
//			
//			if((i+1)%10==0)System.out.println();
//		}
//	}
//}
