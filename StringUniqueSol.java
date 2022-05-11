package leetcode;

import java.util.HashSet;

public class StringUniqueSol {

	public static void main(String[] args) {
		System.out.println(numSplits("abcd"));

	}
	
	public static int numSplits(String s) {
	        int result=0;
	        if(s!=null) {
	        	result=helper(s);
	        }
	        return result;
	    }

	private static int helper(String s) {
		int unique=0;
		HashSet<Character> h = new HashSet<>();
		int[] left = new int[s.length()];
		int[] right = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			h.add(s.charAt(i));
			left[i]=h.size();
		}
		h=new HashSet<>();
		for(int j=s.length()-1;j>=0;j--) {
			h.add(s.charAt(j));
			right[j]=h.size();
		}
		for(int k=0;k<s.length()-1;k++) {
			if(left[k]==right[k+1]) {
				unique++;
			}
		}
		return unique;
	}
}
