package leetcode;

public class MaxProductSubarray {

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] {-1, -3, -10, 0, 60}));

	}
	
public static int maxProduct(int[] nums) {
	if(nums.length==0) {
		return 0;
	}
	int prod = nums[0];
	int maxP = nums[0],minP=nums[0];
	for(int i = 1;i<nums.length;i++) {
		int temp = maxP;
		maxP = Math.max(nums[i], Math.max(nums[i]*maxP,nums[i]* minP));
		minP = Math.min(nums[i], Math.min(nums[i]*temp,nums[i]* minP));
		prod = Math.max(maxP, prod);
	}
	return prod;
    }
}
