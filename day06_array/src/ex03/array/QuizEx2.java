package ex03.array;

public class QuizEx2 {
	public static void main(String[] args) {
		int[][] arr = { { 3, 8, 0 }, { 7, 1, 0 } };

		for (int i = 0; i < arr[0].length - 1; i++)
			arr[i][2] = arr[i][0] * arr[i][1];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}