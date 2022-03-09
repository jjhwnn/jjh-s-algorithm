//package com.javalec.base;
//
//public class RomanToInt {
//
//	public static void main(String[] args) {
//		RomanToInt romanToInt = new RomanToInt();
//		
//		System.out.println(romanToInt.intToRoman(275));
//	}
//	
//	public String intToRoman(int num) {
//		
//		int[] romanUnit = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//		String[] romanSymbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//		String ret = "";
//		
//		int i = 0;
//		
//		while(num > 0){
//			int unitNum = num / romanUnit[i];
//			
//		for(int k=0; k<unitNum; ++k) {
//			ret += romanSymbol[i];
//		}
//			
//		num -= unitNum*romanUnit[i]; ++i; 
//
//		}
//		return ret;
//
//	}
//	
//}

package com.javalec.base;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "MCMXCIV";
		
		//('I', 'V', 'X', 'L', 'C', 'D', 'M').
		int len = s.length();
		int result =0;
		
		
		//charAt() 문자열을 하나하나씩 받아서 인덱스로 반환해주는 메소드
		for(int i = 0; i<len ; i++) {
			if(len -1 - i >= 1) {
				switch(s.charAt(i)) {
				case 'M':
					result += 1000;
					break;
				case 'D':
					result += 500;
					break;
				case 'C':
					if(s.charAt(i+1) == 'D') {
						i++;
						result += 400;
					}else if(s.charAt(i+1) == 'M'){
						i++;
						result += 900;
					}else {
						result += 100;
					}
					break;
				case 'L':
					result += 50;
					break;
				case 'X':
					if(s.charAt(i+1) == 'L') {
						i++;
						result += 40;
					}else if(s.charAt(i+1) == 'C'){
						i++;
						result += 90;
					}else {
						result += 10;
					}
					break;
				case 'V':
					result += 5;
					break;
				case 'I':
					if(s.charAt(i+1) == 'V') {
						i++;
						result += 4;
					}else if(s.charAt(i+1) == 'X'){
						i++;
						result += 9;
					}else {
						result += 1;
					}
					break;
				} //switch
				
			}else {
				switch(s.charAt(i)) {
				case 'M':
					result += 1000;
					break;
				case 'D':
					result += 500;
					break;
				case 'C':

					result += 100;
					
					break;
				case 'L':
					result += 50;
					break;
				case 'X':

					result += 10;
				
					break;
				case 'V':
					result += 5;
					break;
				case 'I':
					result += 1;
					
					break;
				
				
				}
		
		
			}
		
		

		}
		System.out.println(result);

	}
}
