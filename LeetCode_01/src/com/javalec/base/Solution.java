package com.javalec.base;

public class Solution {
	
		public static void main(String[] args) {
			
			int x = 121;
			boolean check = false;
			
		    System.out.println("Input : " + x);

			Solution solution = new Solution();
			check = solution.isPalindrome(x);
			
			System.out.println("Output : " + check);
		}
	
		public boolean isPalindrome(int x) {
        boolean check = false;
	    int result1 = 0;   
	    int result2 = x;
        while(x != 0) {
        	result1 = result1*10 + x%10;
        	x/=10;        	
        }
        
        if(result1 == result2) {
        	check = true;
        	if(result2 < 0) {
        		check = false;
        	}
        	
        }else {
        	check = false;
        }
        	
        return check;
	    }
	 
	
	
}