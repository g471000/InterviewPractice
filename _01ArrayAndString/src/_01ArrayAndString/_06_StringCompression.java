package _01ArrayAndString;

public class _06_StringCompression {
	public static void main(String[] args) {
		String[] testSets = { "null", "", "a", "abcd", "abbbeee", "aabcdddde", "aabcccccaaa" };

		for (int i = 0; i < testSets.length; i++) {
			System.out.println("[" + testSets[i] + "]: " + strComp(testSets[i]));
		}
	}

	public static String strComp(String s) {
		if (s == null)
			return "-1";
		if (s.length() <= 1)
			return s;

		char curr = s.charAt(0);
		int counter = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < s.length(); i++) {
			if (curr == s.charAt(i)) {
				counter++;
			} else {
				sb.append(curr);
				sb.append(counter);
				curr = s.charAt(i);
				counter = 1;
			}
		}

		// a2b1c1d4e1
		sb.append(curr);
		sb.append(counter);

		return s.length() < sb.length() ? s : sb.toString();

	}
}
