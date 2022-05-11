package leetcode;

import java.util.HashMap;

public class HouseRob {

	public static void main(String[] args) {
		System.out.println(rob(new int[] {6,6,4,8,4,3,3,10}));

	}

	public static int rob(int[] nums) {
	    HashMap<Integer, Integer> check = new HashMap<>();
	    int firstStart = helper(0,nums,check);
	    int secondStart = helper(1,nums,check);
		return ((firstStart>=secondStart) ? firstStart : secondStart);
	    }
	
	private static int helper(int index, int[] nums, HashMap<Integer, Integer> check) {
		if(index>=nums.length) {
			return 0;
		}
		if(check.containsKey(index)) {
			return check.get(index);
		}
		int firstOne = nums[index]+helper(index+2,nums,check);
		
		int secondOne =nums[index]+helper(index+3,nums,check);
		check.put(index, ((firstOne>=secondOne) ? firstOne : secondOne));
		return ((firstOne>=secondOne) ? firstOne : secondOne);
	}
	
	
}
