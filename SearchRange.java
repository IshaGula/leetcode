package leetcode;

import java.util.Arrays;

public class SearchRange {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(searchRange(new int[] {}, 0)));

	}
	
	public static int[] searchRange(int[] nums, int target) {
	     int first=helperFirstElement(nums,0,nums.length-1, target);
	     if(first!=-1) {
	    	 int last=helperLastElement(nums,0,nums.length-1, target);
	    	 return new int[] {first,last};
	     }
	     
		 return new int[] {-1,-1};
    }
	
	private static int helperFirstElement(int[] nums,int l,int r, int target){
		if(r>=l) {
			int mid = l+(r-l)/2;
			if(nums[mid]==target&&(mid==0||nums[mid-1]<target)) {
				return mid;
				
			}else if(nums[mid]>=target) {
				return helperFirstElement(nums,l,mid-1,target);
			}else {
				return helperFirstElement(nums,mid+1,r,target);
			}
		}
		return -1;
	}
	
	private static int helperLastElement(int[] nums,int l,int r, int target){
		if(r>=l) {
			int mid = l+(r-l)/2;
			if(nums[mid]==target&&(mid==nums.length-1||nums[mid+1]>target)) {
				return mid;
			}else if(nums[mid]>target) {
				return helperLastElement(nums,l,mid-1,target);
			}else {
				return helperLastElement(nums,mid+1,r,target);
			}
		}
		return -1;
	}

}
