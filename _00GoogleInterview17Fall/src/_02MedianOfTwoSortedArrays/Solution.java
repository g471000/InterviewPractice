package _02MedianOfTwoSortedArrays;

public class Solution {
		
		public double findMedianSortedArrays(int[] nums1, int[] nums2){
			boolean isEven = (nums1.length + nums2.length) % 2 == 0;	
			double division = isEven ? 2.0 : 1.0;
			
			int mid = (nums1.length + nums2.length) / 2;
			int p1 = 0;
			int p2 = 0;
			int curr = 0;
			int prev = 0;
			
			for(int i = 0; i <= mid; i++){
				int val1 = p1 < nums1.length ? nums1[p1] : Integer.MAX_VALUE;
				int val2 = p2 < nums2.length ? nums2[p2] : Integer.MAX_VALUE;
				if(isEven){
					prev = curr;					
				}
				if(val1 < val2){
					curr = val1;
					p1++;
				} else {
					curr = val2;
					p2++;
				}
			}
			
			return (curr + prev) / division;
		}
	
}
