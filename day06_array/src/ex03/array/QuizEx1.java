package ex03.array;

public class QuizEx1 {
	public static void main(String[] args) {
		int[][] arr = { { 3, 8, 5, 10 }, { 7, 1, 2, 3 }, { 0, 0, 0, 0 } };

		for (int i = 0; i < arr[0].length; i++)
			arr[2][i] = arr[0][i] + arr[1][i];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
