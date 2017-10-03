package _01ArrayAndString;

import java.util.Arrays;
import java.util.Random;


// https://leetcode.com/problems/array-partition-i/description/

public class _08_ArrayPartition {
	public static void main(String[] args) {
		Random rand = new Random();
		int n;
		int testSize = 3;
		int curr;
		int[] testArray;
		for (int i = 0; i < testSize; i++) {
			n = rand.nextInt(3) + 1; // 1, 2 or 3
			testArray = new int[n * 2];
			for (int j = 0; j < testArray.length; j++) {
				curr = rand.nextInt(21) - 10;
				testArray[j] = curr;
			}
			System.out.print(printArray(testArray) + " -> ");
			int result = partition(testArray);
			System.out.print(": " + result + "\n");
		}
	}

	public static int partition(int[] array) {
		Arrays.sort(array);
		System.out.print(printArray(array));
		int sum = 0;
		for (int i = 0; i < array.length; i += 2) {
			sum += array[i];
			// sum += Math.min(array[i], array[i + 1]);
		}
		return sum;
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
