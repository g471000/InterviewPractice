package _01ArrayAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Jieun Chon Interview Practice Arrays and Strings
 * 
 * 121 Best time to Buy and Sell stack
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * Say you have an array for which the ith element is the price of a given stock
 * on day i. If you were only permitted to complete at most one transaction (ie,
 * buy one and sell one share of the stock), design an algorithm to find the
 * maximum profit.
 * 
 * Example 1: Input: [7, 1, 5, 3, 6, 4] Output: 5
 * 
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger
 * than buying price)
 * 
 * 
 * Example 2: Input: [7, 6, 4, 3, 1] Output: 0
 * 
 * In this case, no transaction is done, i.e. max profit = 0.
 * 
 * @author Jieun Chon
 *
 */
public class _13_BestTimeStock {
	public static void main(String[] args) {
		int[][] testSet = { {}, { 1 }, { 1, 2, 3, 4, 5 }, { 5, 4, 2, 1 }, { 7, 1, 4, 7, 2, 9, 0, 10 } };
		for (int[] set : testSet) {
			System.out.println(Arrays.toString(set) + ": " + findMax(set));
			System.out.println(Arrays.toString(set) + ": " + findMaxBetter(set));
		}

		Random rand = new Random();
		int testSize = 5;
		ArrayList<int[]> list = new ArrayList<>();
		for (int i = 0; i < testSize; i++) {
			int[] arr = new int[rand.nextInt(10)];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = rand.nextInt(10);
			}
			list.add(arr);
		}
		System.out.println();

		for (int[] set : list) {
			System.out.println(Arrays.toString(set) + ": " + findMax(set));
			System.out.println(Arrays.toString(set) + ": " + findMaxBetter(set));
		}
	}

	public static int findMaxBetter(int[] stocks) {
		int max = 0;
		if (stocks.length <= 1) {
			return max;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < stocks.length; i++) {
			max = Math.max(max, stocks[i] - min);
			min = Math.min(min, stocks[i]);
		}
		return max;
	}

	public static int findMax(int[] stocks) {
		int max = 0;
		if (stocks.length <= 1) {
			return max;
		}
		for (int i = 0; i < stocks.length - 1; i++) {
			for (int j = i + 1; j < stocks.length; j++) {
				max = Math.max(max, (stocks[j] - stocks[i]));
			}
		}
		return max;
	}
}
