package leetcode;

import java.util.Arrays;

public class LongIncreasSubseq {

	public static void main(String[] args) {		
		System.out.println(lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
	}
	
	
	public static int lengthOfLIS(int[] nums) {
		int[] lis = new int[nums.length];
		int maxL=0;
		
		Arrays.fill(lis, 1);
		for(int i =1;i<nums.length;i++) {
			for(int j =0;j<i;j++) {
				if(nums[i]>nums[j]&&lis[i]<=lis[j]) {
					lis[i]=1+lis[j];
				}
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			if(maxL<lis[i]) {
				maxL=lis[i];
			}
		}
		
		
		return maxL;
    }

}
