package com.javalec.base;

public class SearchInsert {
	// 오름차순 정렬된 정수형 배열과 정수 target을 입력받고
	// target이 정수형 배열에 존재하면 해당 배열의 인덱스를 반환하고
	// 존재하지 않는다면, target보다 작은 인덱스 다음 인덱스에 삽입후 해당 인덱스 반환
	
	
	public static void main(String[] args) {
		SearchInsert insert = new SearchInsert();
		
		int[] nums = {1,3,5,6};
		int target = 7;
		
		int result = insert.searchInsert(nums, target);
		
		System.out.println(result);
	}
	

public int searchInsert(int[] nums, int target) {
        
        int result = 0;
        // 
        for(int i=0; i< nums.length; i++){
        	//target이 nums인덱스 내에 존재한다면 result에 해당 인덱스 반환
            if(nums[i] == target){
                result = i;
                
                // nums배열을 모두 돌았는데 target이 존재하지 않을때
                // 그리고 타겟이 nums배열보다 크다면 해당 nums 인덱스 다음 번지수를 result에 대입
            }else if(nums[nums.length-1] != target && nums[i] < target) {
    			result = i+1;
            }
            
        }
        return result;
    }
	
}
