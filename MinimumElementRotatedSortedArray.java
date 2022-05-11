package leetcode;

public class MinimumElementRotatedSortedArray {

	public static void main(String[] args) {
		System.out.println(findMin(new int[] {5, 6, 2, 3, 4}));
	}
	
	public static int findMin(int[] nums) {
		return helper(nums,0,nums.length-1);
	}
	private static int helper(int[] a, int low, int high) {
		while(low<high) {
			int mid = low+(high-low)/2;
			if(a[mid]==a[high]) {
				high--;
			}
			else if(a[mid]>a[high]) {
				low = mid+1;
			}else {
				high=mid;
			}
			
		}
		return a[high];
	}

}
