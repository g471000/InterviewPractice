package _01ArrayAndString;

public class _04_PP {
	public static void main(String[] args) {
		String[] testSets = { "", "a", "bb", "ab", "aba", "aaa", "aaaa", "Tact Coa", "Tact ocOa", "a t c a " };
		for (int i = 0; i < testSets.length; i++) {
			System.out.println("[" + testSets[i] + "]: " + isPP(testSets[i]));
		}
	}

	public static boolean isPP(String s) {
		int count = 0;
		int[] checker = new int[(int) 'z' - (int) 'a' + 1];
		for (int i = 0; i < s.length(); i++) {
			int index = getCVal(s.charAt(i));
			if (index != -1) {
				checker[index]++;
				if (checker[index] % 2 == 0) {
					count--;
				} else {
					count++;
				}
			}
		}
		return count <= 1;
	}

	public static int getCVal(char c) {
		int a = Character.getNumericValue('a'); // A, 10 -> 0
		int z = Character.getNumericValue('z'); // Z
		int numC = Character.getNumericValue(c);
		if (numC >= a && numC <= z) {
			return numC - a;
		}
		return -1;
	}
}
