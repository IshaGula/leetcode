package leetcode;

import java.util.Arrays;

public class ProductArrayExceptSelf {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,3,4})));
	}
	
	public static int[] productExceptSelf(int[] nums) {
	
		return helper(nums);
	}
	
	private static int[] helper(int[] nums) {
		int prod = 1;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                flag++;
            else
                prod *= nums[i];
        }
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (flag > 1) {
                arr[i] = 0;
            }
            else if (flag == 0)
                arr[i] = (prod / nums[i]);
            else if (flag == 1 && nums[i] != 0) {
                arr[i] = 0;
            }
            else
                arr[i] = prod;
        }
        return arr;
	}

}
