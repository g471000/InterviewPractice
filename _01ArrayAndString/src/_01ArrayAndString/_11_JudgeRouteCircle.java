package _01ArrayAndString;

public class _11_JudgeRouteCircle {
	public static void main(String[] args) {
		String[] testSet = { "", "U", "UD", "LL", "UDUDUDUDUDUDUDUDUDRL",
				"UDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDURDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRLUDUDUDUDUDUDUDUDUDRL" };

		for (String s : testSet) {
			System.out.println("[" + printShort(s) + "]: " + judgeRouteCircle(s));
		}
	}

	public static String printShort(String s) {
		if (s.length() > 20) {
			return s.substring(0, 10) + "......" + s.substring(s.length() - 10, s.length()) + "(" + s.length() + ")";
		}
		return s;
	}

	public static boolean judgeRouteCircle(String s) {
		int x = 0, y = 0;
		for (char c : s.toCharArray()) {
			if (c == 'R') {
				x++;
			} else if (c == 'L') {
				x--;
			} else if (c == 'U') {
				y++;
			} else { // D
				y--;
			}
		}
		return x == 0 && y == 0;
	}
}
