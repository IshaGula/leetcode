package leetcode;

import java.util.Arrays;

public class MinDifference {

	public static void main(String[] args) {
		System.out.println(minDifference(new int[] {1,5,0,10,14}));

	}
	
	
	public static int minDifference(int[] nums) {
		if(nums.length<=4) {
			return 0;
		}else {
			int min = Integer.MAX_VALUE;
			Arrays.sort(nums);
			for(int i=0;i<=3;i++) {
				min=Math.min(min, nums[nums.length-4+i]-nums[i]);
			}
			return min;
		}
		
	}
	
	private static int helper(int[] nums) {
		int start=0,end=0;
		int[] newmin = new int[4];
		int min=getDiff(nums, start, end);
		newmin[0]=min;
		for(int i =0;i<3;i++) {
			int left = getDiff(nums, start+1, end);
			int right = getDiff(nums, start, end+1);
			if(left<=right) {
				start=start+1;
				newmin[i+1]=left;
			}else {
				newmin[i+1]=right;
				end=end+1;
			}
		}
		return min;
	}
	
	private static int getDiff(int[] nums,int i,int j) {
		int min=nums[i],max=nums[i];
		i=i+1;
		while(i<nums.length-j) {
			if(nums[i]<min) {
				min=nums[i];
			}else if(nums[i]>max) {
				max=nums[i];
			}
			i++;
		}
		return max-min;
	}

}
