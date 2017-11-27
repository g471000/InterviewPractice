package _03validparentheses;

import java.util.*;
public class ValidParentheses {
	public static void main(String[] args){
		String s = "";
		System.out.println(s + ": " + isValid(s));
		
		s = "(";
		System.out.println(s + ": " + isValid(s));
		
		s = "(){}[]";
		System.out.println(s + ": " + isValid(s));
		
		s = "([)]";
		System.out.println(s + ": " + isValid(s));
		
		s = "{}()[][]{[]}[]({[]})";
		System.out.println(s + ": " + isValid(s));
	}
	
	public static boolean isValid(String s){
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++){
			if(!stack.isEmpty() && isSet(stack.peek(), s.charAt(i))){
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}
		return stack.isEmpty();
	}
	
	public static boolean isSet(Character c1, Character c2){
		if(c1 == '('){
			return c2 == ')';
		} else if (c1 == '{'){
			return c2 == '}';
		} else if (c1 == '['){
			return c2 == ']';
		}
		return false;
	}
	
	
}
