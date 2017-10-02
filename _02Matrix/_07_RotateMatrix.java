package _01ArrayAndString;

public class _07_RotateMatrix {
	public static void main(String[] args) {
		// int[][] matrix = {{1, 2}, {3, 4}};
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// System.out.println(toString(matrix) + "\n");
		// System.out.println(toString(rotate(matrix)));

		System.out.println(toString(matrix2));
		System.out.println(toString(rotate(matrix2)));
	}

	public static int[][] rotate(int[][] matrix) {
		if (matrix == null)
			return null;
		if (matrix.length == 0)
			return matrix;
		if (matrix.length != matrix[0].length)
			return null;
		if (matrix.length == 1)
			return matrix;

		int lindex = matrix.length - 1;
		int temp;
		for (int i = 0; i < lindex; i++) {
			temp = matrix[0][lindex - i];
			matrix[0][lindex - i] = matrix[i][0];
			matrix[i][0] = matrix[0][lindex - i];
			matrix[0][lindex - i] = matrix[lindex - i][lindex];
			matrix[lindex - i][lindex] = temp;
		}
		/*
		 * i = 0 -> i < lindex 0, 0 -> 2, 0 x: i -> lindex 1, 0 -> 2, 1 y: 0 -> i
		 * 
		 * 2, 0 -> 2, 2 x: lindex -> lindex - i 2, 1 -> 1, 2 y: i -> lindex
		 * 
		 * 2, 2 -> 0, 2 x: lindex - i -> 0 1, 2 -> 0, 1 y: lindex -> lindex - i
		 * 
		 * 0, 2 -> 0, 0 x: 0 -> i 0, 1 -> 1, 0 y: lindex - i -> 0
		 */

		/*
		 * int lindex = matrix.length - 1; int temp = matrix[0][0]; matrix[0][0] =
		 * matrix[lindex][0]; matrix[lindex][0] = matrix[lindex][lindex];
		 * matrix[lindex][lindex] = matrix[0][lindex]; matrix[0][lindex] = temp;
		 */

		return matrix;
	}

	public static String toString(int[][] matrix) {
		if (matrix == null)
			return null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sb.append(matrix[i][j] + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
