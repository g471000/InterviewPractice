package _01ArrayAndString;

public class _03_URLify {
	public static void main(String[] args) {
		System.out.println("[" + urlify("", 0) + "]");
		System.out.println("[" + urlify("a", 1) + "]");
		System.out.println("[" + urlify("   ", 1) + "]");
		System.out.println("[" + urlify("a b  ", 3) + "]");
		System.out.println("[" + urlify("abcdef", 6) + "]");
		System.out.println("[" + urlify("Mr John Smith    ", 13) + "]");
	}

	public static String urlify(String s, int leng) {
		if (s.length() == leng) {
			return s;
		}
		int endIndex = s.length() - 1;
		char[] cArr = s.toCharArray();
		for (int i = (leng - 1); i >= 0; i--) {
			if (cArr[i] == ' ') {
				cArr[endIndex] = '0';
				cArr[endIndex - 1] = '2';
				cArr[endIndex - 2] = '%';
				endIndex -= 3;
			} else {
				cArr[endIndex] = cArr[i];
				endIndex -= 1;
			}
		}
		return new String(cArr);
	}
}
