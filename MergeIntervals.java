package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(merge(new int[][] {{3, 50}, {12, 30}, {1, 2},
	        {6, 20}, {20, 1000}})));

	}
	
	public static int[][] merge(int[][] intervals) {
		
//	    final Comparator<int[]> arrayComparator = new Comparator<int[]>() {
//	        @Override
//	        public int compare(int[] o1, int[] o2) {
//	            return Integer.compare(o1[0], o2[0]);
//	        }
//	    };
//	    Arrays.sort(intervals, arrayComparator);
		
//		Stack<int[]> stack=new Stack<>();
//		stack.push(intervals[0]);
//		int[] array = stack.peek();
//		System.out.println(array[1]);
		
	    Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
	    ArrayList<int[]> c = new ArrayList<>();
	    c.add(intervals[0]);
	    int index=0;
	    for(int i =1;i<intervals.length;i++) {
	    	int[] x = c.get(index);
	    	
	    	if(intervals[i][0]<x[1]) {
	    		if(intervals[i][1]>=x[1]) {
	    			c.remove(index);
	    			x[1]=intervals[i][1];
		    		c.add(x);
	    		}
	    	}else {
	    		index++;
	    		c.add(intervals[i]);
	    	}
	    }
	    int[][] fO = new int[c.size()][2];
	    for(int i =0;i<c.size();i++) {
	    	fO[i]=c.get(i);
	    }
		return fO;
    }

}
