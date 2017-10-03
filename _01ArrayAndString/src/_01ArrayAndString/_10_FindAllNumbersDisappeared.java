package _01ArrayAndString;

import java.util.*;

public class _10_FindAllNumbersDisappeared {
	public static void main(String[] args) {
		int[][] arrSets = { { 4, 3, 2, 7, 8, 2, 3, 1 }, { 4, 3, 3, 3, 1, 1, 1, 1 }, {}, { 1 }, { 1, 4, 3, 5, 2 } };
		for (int i = 0; i < arrSets.length; i++) {
			System.out.print(printArray(arrSets[i]) + " -> ");
			System.out.print(findAll(arrSets[i]) + "\n");
		}

	}

	public static List<Integer> findAll(int[] array) {
		int index;
		for (int i = 0; i < array.length; i++) {
			index = Math.abs(array[i]) - 1;
			array[index] = Math.abs(array[index]) * -1;
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				list.add(i + 1);
			}
		}
		return list;
	}

	public static String printArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i < array.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
