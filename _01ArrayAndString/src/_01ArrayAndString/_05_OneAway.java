package _01ArrayAndString;

//pala, pale -> true
//pales, pale -> true
//pale, bale -> true
//pale, bae -> false

// abcd abcd -> true
// abcd adcd -> true
// abcc adcd -> false

// abc abcdd -> false

// abc dabc -> true
// abc afbc -> true
// abc abcd -> true

public class _05_OneAway {
	public static void main(String[] args) {
		String[][] testSets = { { "pala", "pale" }, { "pales", "pale" }, { "pale", "bale" }, { "pale", "bae" },
				{ "abcd", "abcd" }, { "abcd", "adcd" }, { "abcc", "adcd" }, { "abc", "abcdd" }, { "abc", "dabc" },
				{ "abc", "afbc" }, { "abc", "abcd" }, { "", "" }, { "abcdefg", "aacdefg" }, { null, "a" }, { "a", null } };
		for (int i = 0; i < testSets.length; i++) {
			System.out.println(
					"[" + testSets[i][0] + "," + testSets[i][1] + "]: " + oneAway(testSets[i][0], testSets[i][1]));
			System.out.println(
					"[" + testSets[i][0] + "," + testSets[i][1] + "]: " + oneAway2(testSets[i][0], testSets[i][1]));
			System.out.println();
			
		}
	}

	public static boolean oneAway(String s1, String s2) {
		if (s1 == null || s2 == null) {
			return false;
		} else if (s1.length() == s2.length()) {
			return replaceHelper(s1, s2);
		} else if (s1.length() - s2.length() == 1) {
			return insertHelper(s2, s1);
		} else if (s2.length() - s1.length() == 1) {
			return insertHelper(s1, s2);
		}
		return false;
	}

	public static boolean oneAway2(String s1, String s2) {
		if (s1 == null || s2 == null) {
			return false;
		}
		if (Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}

		boolean isOneAway = false;
		int p1 = 0;
		int p2 = 0;
		while (p1 < s1.length() && p2 < s2.length()) {
			if (s1.charAt(p1) != s2.charAt(p2)) {
				if (isOneAway) {
					return false;
				} else {
					isOneAway = true;
					// add acb
					if (s1.length() == s2.length()) {
						p1++;
						p2++;
					} else if (s1.length() > s2.length()) {
						p1++;
						// aab ab
					} else {
						p2++;
						// abd abcd
						// abd adde

						// abc dabc
						// abc acbc
						// abf abcd
					}
				}
			} else {
				p1++;
				p2++;
			}
		}

		return true;
	}

	// abc abc
	// abd acd
	// abc acb
	// abcd cdfe
	public static boolean replaceHelper(String s1, String s2) {
		boolean isOneAway = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (isOneAway) {
					return false;
				} else {
					isOneAway = true;
				}
			}
		}
		return true;
	}

	// abc dabc -> true
	// abc afbc -> true
	// abc abcd -> true
	// abc abdd -> false
	public static boolean insertHelper(String s1, String s2) {
		boolean isOneAway = false;
		int p1 = 0;
		int p2 = 0;
		while (p1 < s1.length() && p2 < s2.length()) {
			if (s1.charAt(p1) != s2.charAt(p2)) {
				if (isOneAway) {
					return false;
				} else {
					isOneAway = true;
					p2++;
				}
			} else {
				p1++;
				p2++;
			}
		}
		return true;
	}
}
