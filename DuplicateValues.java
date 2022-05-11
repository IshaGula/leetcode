package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateValues {

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));

	}

	public static boolean containsDuplicate(int[] nums) {
//		Arrays.sort(nums);
//		for(int i =0;i<nums.length-1;i++) {
//			if(nums[i]==nums[i+1]) {
//				return true;
//			}
//		}
//		return false;
		HashMap<Integer, Integer> h = new HashMap<>();
		for(int i =0;i<nums.length;i++) {
			if(h.containsKey(nums[i])) {
				return true;
			}
			h.put(nums[i], i);
		}
		return false;
    }
}
