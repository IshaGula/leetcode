package leetcode;

public class FindPeakElement {

	public static void main(String[] args) {
		System.out.println(findPeakElement(new int[] {1,2}));
	}
	
	public static int findPeakElement(int[] nums) {
		return helper(nums,nums.length);
	}
	
	private static int helper(int[] a, int n) {
		int l=0,r=n-1,mid=0;
		while(l<=r) {
			mid=l+(r-l)/2;
			if((mid==0||a[mid-1]<=a[mid])&&(mid==n-1||a[mid+1]<=a[mid])) {
				break;
			}
			if(mid > 0&&a[mid]<a[mid-1]) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		return mid;
	}

}
