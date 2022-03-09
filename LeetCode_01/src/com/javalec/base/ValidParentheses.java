package com.javalec.base;

public class ValidParentheses {
	
	public static void main(String[] args) {
		
		
	}
	

public boolean isValid(String s) {
        
		boolean check = false;
		s ="(]";
		
		if(s.length() == 1 || s.length() == 0) {
			check =false;
		}

		

		
		return check;
		
	}
}
