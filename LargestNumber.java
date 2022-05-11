package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println(largestNumber(new int[] {3,30,34,5,9}));

	}

	public static String largestNumber(int[] nums) {
	    String answer=null;
	    if(nums.length>0) {
	    	answer=helper(nums);
	    }
		return answer;
	}

	private static String helper(int[] nums) {
		String num="";
		
		int[] newNums = new int[nums.length];
		HashMap<Integer, Integer> check = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			check.put(nums[i]%10, nums[i]);
			newNums[i]=nums[i]%10;
		}
		Arrays.sort(newNums);
		for(int j=nums.length-1;j>=0;j--) {
			num=num+check.get(newNums[j]);
		}
		return num;
	}
}
