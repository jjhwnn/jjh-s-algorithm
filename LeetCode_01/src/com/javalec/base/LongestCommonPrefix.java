package com.javalec.base;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		
		//String[] strs = {"flower","flow","flight"};
		String[] strs = {"cir", "car"};
		
		String str = prefix.longestCommonPrefix(strs);
		
		System.out.println(str);
		
	}
	
	public String longestCommonPrefix(String[] strs) {
		  if (strs == null || strs.length == 0) {
		    return "";
		  }
		  
		  for (int i = 0; i < strs[0].length(); i++) {
		    for (int j = 1; j < strs.length; j++) {
		      if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
		        return strs[0].substring(0, i);
		      }
		    }
		  }
		  
		  return strs[0];
		}
	
}
