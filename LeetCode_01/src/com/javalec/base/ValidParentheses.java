package com.javalec.base;

public class ValidParentheses {
	
	public static void main(String[] args) {
		
		ValidParentheses validParentheses = new ValidParentheses();
		
		String s ="()";
		
		boolean check = validParentheses.isValid(s);
		
		System.out.println(check);
		
		
	}
	

public boolean isValid(String s) {
		// 향상된 for문과 toCharArray()메소드를 이용
	
	
		boolean check = false;
		
		
		if(s.length() == 1 || s.length() == 0) {
			check =false;
		}
		
		
		
		
		
		
		return check;
		
	}
}
