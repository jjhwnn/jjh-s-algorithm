package com.javalec.base;

public class ValidParentheses {
	
	public static void main(String[] args) {
		
		ValidParentheses validParentheses = new ValidParentheses();
		
		String s ="(()())";
		
		boolean check = validParentheses.isValid(s);
		
		System.out.println(check);
		
	}
	

public boolean isValid(String s) {
		// 향상된 for문과 toCharArray()메소드를 이용
	
	
		boolean check = false;
		
		
		if(s.length() == 1 || s.length() == 0) {
			check =false;
		}
		
		for(int i = 0; i < s.length(); i++) {
				
				switch(s.charAt(i)) {
				case '(':
					if(s.charAt(i+1)== ')') {
						check = true;
					}else {
						check = false;
					}
					break;
				case '{':
					if(s.charAt(i+1)== '}') {
						check = true;
					}else {
						
						check = false;
					}
					break;
				case '[':
					if(s.charAt(i+1)== ']') {
						check = true;
					}else {
						
						check = false;
					}
					break;
				case ')':
					if(i >= 1 && s.charAt(i-1) == '(') {
						check = true;
					}else {
						
						check = false;
					}
					break;
				case '}':
					if(i >= 1 && s.charAt(i-1) == '{') {
						check = true;
					}else {
						
						check = false;
					}
					break;
				case ']':
					if(i >= 1 && s.charAt(i-1) == '[') {
						check = true;
					}else {
						
						check = false;
					}
					break;
				
				}
				
				if(s.charAt(i) == 'i')
			
		}
		

		
		
		
		
		return check;
		
	}
}
