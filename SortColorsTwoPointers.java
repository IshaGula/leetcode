package leetcode;

import java.util.Arrays;

public class SortColorsTwoPointers {

	public static void main(String[] args) {
		sortColors(new int[] {2,0,2,1,1,0});

	}

	
	public static void sortColors(int[] nums) {
        int start = 0, i=0,end=nums.length-1;
        while(i<=end){
            if(nums[i]==1){
                i++;
            }else if(nums[i]==0){
                int temp = nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
                start++;
                i++;
            }else if(nums[i]==2){
                int temp = nums[end];
                nums[end]=nums[i];
                nums[i]=temp;
                end--;
            }
        }
        
        System.out.println(Arrays.toString(nums));
    }
}
