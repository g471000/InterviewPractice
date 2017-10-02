package _01ArrayAndString;

import java.util.Arrays;

public class _02_IsPermutation {
	public static void main(String[] arg){
		String[][] testSet = {{"abcd", "dcba"}, {"ab", "abc"}, {"abcd", "abcc"}};
		for(int i = 0; i < testSet.length; i++){
			System.out.println("isPerm ," + i);
			System.out.println(isPerm(testSet[i][0], testSet[i][1]));
			System.out.println("isPerm2: ," + i);
			System.out.println(isPerm2(testSet[i][0], testSet[i][1]));

}
	}

	public static boolean isPerm2(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		// ¡®a¡¯
		// ASCII 128 chars
		int[] checker = new int[128];
		for (int i = 0; i < s1.length(); i++) {
			int val = (int) s1.charAt(i);
			checker[val]++;
		}

		for (int j = 0; j < s2.length(); j++) {
			int val = (int) s2.charAt(j);
			if (checker[val] == 0) {
				return false;
			}
			checker[val]--;
		}
		return true;
	}

	public static boolean isPerm(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		String s1sorted = isPermHelper(s1);
		String s2sorted = isPermHelper(s2);

		if (s1sorted.equals(s2sorted)) {
			return true;
		}
		return false;
	}

	public static String isPermHelper(String s) {
		char[] cArr = s.toCharArray();
		Arrays.sort(cArr);
		return new String(cArr);
	}

}
