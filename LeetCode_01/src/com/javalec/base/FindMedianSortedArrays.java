package com.javalec.base;

import java.util.Arrays;

public class FindMedianSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // sort
    	// 내림차순 : Arrays.sort(arr,Collections.reverseOrder());
    	
		// 
		
    	// 중앙값을 받을 변수 
    	double median = 0;
    	
    	// 매개변수로 받은 두 배열을 합칠 배열 선언
        int[] merge = new int [nums1.length+nums2.length];
        
        // 인덱스0부터 nums1 배열길이 만큼 merge배열에 데이터 넣기
        for(int i=0; i < nums1.length; i++) {
        	merge[i] = nums1[i];
        }
        
        // nums1 배열을 받은 다음 인덱스부터 nums2 인덱스 길이 만큼 merge에 nums2 값 받기
        for(int j=0; j < nums2.length; j++) {
        	merge[nums1.length+j] = nums2[j];
        }
        
        // Arrays 의 sort메서드를 통해 오름차순 재정렬
        Arrays.sort(merge);
        
        // merge의 인덱스 길이가 홀수일때 중앙값 median에 입력
        if(merge.length % 2 == 1) {
        	median = merge[merge.length/2];
        	
        	// merge 인덱스 길이가 짝수일 때 인덱스 중앙 두 값의 평균값 입력
        }else {
        	median = (double)(merge[merge.length/2-1]+merge[merge.length/2]) / 2;
        }
        
        return median;
    }
}
