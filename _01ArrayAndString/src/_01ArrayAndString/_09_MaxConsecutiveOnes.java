package _01ArrayAndString;

import java.util.Random;

public class _09_MaxConsecutiveOnes {
	public static void main(String[] args) {
		Random rand = new Random();
		int testSize = 5;
		int size;
		int digit;
		int[] testArr;
		for (int i = 0; i < testSize; i++) {
			size = rand.nextInt(15);
			testArr = new int[size];
			for (int j = 0; j < testArr.length; j++) {
				testArr[j] = rand.nextInt(2);
			}
			System.out.println(printArray(testArr) + ": " + maxConsOnes(testArr));
		}
	}

	public static int maxConsOnes(int[] array) {
		int max = 0;
		int currMax = 0;
		for (int i : array) {
			if (i == 1) {
				currMax++;
				max = Math.max(currMax, max);
			} else {
				currMax = 0;
			}
		}
		return max;
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
