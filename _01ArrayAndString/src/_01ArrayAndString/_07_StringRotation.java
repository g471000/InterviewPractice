package _01ArrayAndString;

public class _07_StringRotation {
	public static void main(String[] args) {
		String[][] testSets = { { null, null }, { null, "a" }, { "b", null }, { "", "" },
				{ "waterbottle", "erbottlewat" }, { "erbotlewat", "waterbottle" }, { "waterbottle", "erbattlewat" } };
		for (String[] set : testSets) {
			System.out.println("[" + set[0] + "," + set[1] + "]: " + isRotated(set[0], set[1]));
		}
	}

	public static boolean isRotated(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		if (s1.length() != s2.length() || s1.length() == 0) {
			return false;
		}
		String test = s2 + s2;
		return isSubstring(test, s1);
	}

	public static boolean isSubstring(String s1, String s2) {
		return s1.contains(s2);
	}
}
