package leetcode;

import java.util.HashMap;
import java.util.Map;

public class StringUnique {

	public static void main(String[] args) {
		System.out.println(numSplits("abcd"));

	}
	
public static int numSplits(String s) {
     int unique=0;
     if(s.length()==1) {
    	 return unique;
     }
     int j = uniChar(s);
     for(int i=j/2;i<s.length();i++) {
    	 int left = uniChar(s.substring(0, i));
    	 int right=uniChar(s.substring(i, s.length()));
    	 if(left==right) {
    		 unique++;
    	 }
     }
     return unique;
    }

	private static int uniChar(String sub) {
		HashMap<Character,Integer> un = new HashMap<>(); 
		int dis = 0;
		for(int i=0;i<sub.length();i++) {
			if(!un.containsKey(sub.charAt(i))) {
				un.put(sub.charAt(i), i);
			}
		}
		for (Map.Entry<Character, Integer> pair: un.entrySet()) {
            dis++;
        }
		return dis;
	}
}
