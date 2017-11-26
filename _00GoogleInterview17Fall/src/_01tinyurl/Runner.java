package _01tinyurl;

import java.util.Random;

public class Runner {
	static String test = "abcdefghijklmn";
	public static void main(String[] args) {
		TinyURL tiny = new TinyURL();
		for(int i = 0; i < 10000000; i++) {
			String shortUrl = tiny.encode(genRandString());
			System.out.print(shortUrl + " ");
			System.out.println(tiny.decode(shortUrl));
		}
	}
	
	public static String genRandString() {
		StringBuilder sb = new  StringBuilder();
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			sb.append(test.charAt(rand.nextInt(test.length())));
		}
		return "https://www.longsentence.com/" + sb.toString();
	}
	
	
}
