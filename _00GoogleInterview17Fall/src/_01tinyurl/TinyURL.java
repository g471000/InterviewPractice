package _01tinyurl;

import java.util.*;
public class TinyURL {
	private HashMap<String, String> stol;
	private HashMap<String, String> ltos;
	String elements;
	private int maxLength;
	
	public TinyURL() {
		ltos = new HashMap<>();
		stol = new HashMap<>();
		elements = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		maxLength = 1;
	}
	
	public String decode(String shortUrl) {
		return stol.get(shortUrl.replace("http://tiny.url/", ""));
	}
	
	public String encode(String longUrl) {
		if(ltos.containsKey(longUrl)) {
			return "http://tiny.url/" + ltos.get(longUrl);
		}
		String code = getCode(maxLength);
		int duplication = 0;
		while(stol.containsKey(code)) {
			duplication++;
			if(duplication == 10) {
				maxLength++;
			}
			code = getCode(maxLength);
		}
		stol.put(code, longUrl);
		ltos.put(longUrl, code);
		return "http://tiny.url/" + code;
	}

	public String getCode(int len) {
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		for(int i = 0; i < len; i++) {
			sb.append(elements.charAt(rand.nextInt(elements.length())));
		}
		return sb.toString();
	}
}
