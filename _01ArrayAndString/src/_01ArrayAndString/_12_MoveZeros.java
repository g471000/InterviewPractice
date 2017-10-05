
package _01ArrayAndString;

import java.util.Arrays;

public class _12_MoveZeros {
	public static void main(String[] args) {
		int[][] testSets = { {}, { 1 }, { 1, 2, 3, 4, 5 }, { 1, 2, 0, 0, 0, 4, 5 }, { 0, 0, 0, 1, 2 },
				{ 1, 2, 4, 0, 4, 7, 7, 0, 0, 0 } };
		for (int i = 0; i < testSets.length; i++) {
			System.out.println(Arrays.toString(testSets[i]) + 
					" -> " + Arrays.toString(movesZeros(testSets[i])));
		}
	}

	public static int[] movesZeros(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[index++] = array[i];
			}
		}

		for (int j = index; j < array.length; j++) {
			array[j] = 0;
		}
		return array;
	}
}
