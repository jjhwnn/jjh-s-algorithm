package com.javalec.base;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		RemoveDuplicates duplicates = new RemoveDuplicates();
		
		int[] nums = {98,99,99,100};
		
		int result = duplicates.removeDuplicates(nums);
		
		System.out.println(result);
	}
	
	public int removeDuplicates(int[] nums) {
        // 정수 배열 번호가 내림차순이 아닌 순서로 정렬되면 중복 요소를 제거하여
		// 각 고유 요소가 한 번만 나타나도록 합니다.
		// 원소의 상대적 순서는 동일하게 유지되어야 합니다.
		
		int count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				
				if(j <= nums.length-1 && nums[i] == nums[j]) {
					
					nums[j] = 9999;
					
				}
				
			}
			
		}

		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] == 9999) {
				count += 1;
			}
			
		}
		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			
			System.out.print(nums[i] + " ");
		}
		
		
		
		return nums.length - count;
    }
}
