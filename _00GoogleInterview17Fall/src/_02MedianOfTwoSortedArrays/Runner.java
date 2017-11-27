package _02MedianOfTwoSortedArrays;

public class Runner {
	public static void main(String[] args){
		Solution sol = new Solution();
		int[] nums1 = new int[]{};
		int[] nums2 = new int[]{1, 3, 5, 7, 9};
		System.out.println(sol.findMedianSortedArrays(nums1, nums2));
		System.out.println(sol.findMedianSortedArrays(nums2, nums1));
		
		nums1 = new int[]{2, 4, 6, 8};
		System.out.println(sol.findMedianSortedArrays(nums1, nums2));
		System.out.println(sol.findMedianSortedArrays(nums2, nums1));
		
		nums1 = new int[]{2, 4, 6, 8, 10};
		System.out.println(sol.findMedianSortedArrays(nums1, nums2));
		System.out.println(sol.findMedianSortedArrays(nums2, nums1));
		
		nums1 = new int[]{1, 2};
		nums2 = new int[]{3, 4};
		System.out.println(sol.findMedianSortedArrays(nums1, nums2));
		System.out.println(sol.findMedianSortedArrays(nums2, nums1));
		
		nums1 = new int[]{1, 3};
		nums2 = new int[]{2};
		System.out.println(sol.findMedianSortedArrays(nums1, nums2));
		System.out.println(sol.findMedianSortedArrays(nums2, nums1));
	}
}
