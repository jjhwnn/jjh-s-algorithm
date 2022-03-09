package com.javalec.base;

public class TwoSum {
	
	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		
		int[] nums = {1, 2, 1, 4};
		int target = 6;
		int[] result = twoSum.twoSum(nums, target);
		
		
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
    public int[] twoSum(int[] nums, int target) {

    	int[] nums1 = new int[2];
    	
    	for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					nums1[0] = i;
					nums1[1] = j;
					
					
				}
  
			}
    			
    	}

    	
    	
    	

    	return nums1;
    }
}
