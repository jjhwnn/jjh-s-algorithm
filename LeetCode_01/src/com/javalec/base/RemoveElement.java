package com.javalec.base;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveElement {
	public static void main(String[] args) {
		RemoveElement element = new RemoveElement();
		
		int[] nums = {3,2,2,1,3,0,4,2};
				
		int val = 2;
		
		int result = element.removeElement(nums, val);
		
		System.out.println(result);
	}
	
	public int removeElement(int[] nums, int val) {
	    // nums배열과 val배열을 입력받고
		// 배열 내에 val에 해당하는 수들을 모두 제거하고
		// 남은 수들의 개수를 반환
		// 배열의 위치는 바뀌지 않아야 한다.
		
		int result = 0;
		
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			arrayList.add(nums[i]);
		}
		
		for(int i = 0; i < arrayList.size(); i++) {
		
			if (arrayList.get(i) == val) {
				
				arrayList.remove(i);
			}
		
		}
		System.out.println(arrayList);
		result = arrayList.size();
		 
		for(int i =0; i < arrayList.size(); i++) {
			nums[i] = arrayList.get(i);
		}
		
//		for (int i = 0; i < nums.length; i++) {
//			
//			if(nums[i] == val) {
//				
//				nums[i] = 0;
//				result += 1;
//			}
//			
//		}
		
		
		
		 return nums.length-result;
    }
}
