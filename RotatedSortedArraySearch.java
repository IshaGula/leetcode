package leetcode;

public class RotatedSortedArraySearch {

	public static void main(String[] args) {
		System.out.println(search(new int[] {1,3},3));

	}
	
	public static int search(int[] nums, int target) {
		return helper(nums,0,nums.length-1,target);
    }
	
	public static int helper(int[] nums, int l, int r, int tar) {
		if(r>=l) {
			int mid = l+(r-l)/2;
			if(nums[mid]==tar) {
				return mid;
			} else if(nums[l]<=nums[mid]) {
				if(nums[l]<=tar && tar<nums[mid]) {
					return helper(nums,l,mid-1,tar);
				}else {
					return helper(nums,mid+1,r,tar);
				}
			}else {
				if(nums[mid]<tar && tar<=nums[r]) {
					return helper(nums,l,mid-1,tar);
				}else {
					return helper(nums,mid+1,r,tar);
				}
			}
		}
		
		return -1;
	}

}
