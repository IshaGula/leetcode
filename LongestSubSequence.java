package leetcode;

public class LongestSubSequence {

	public static void main(String[] args) {
		System.out.println(lenLong("abcabcabc"));

	}



public static int lenLong(String s) {
    String check = "";   
    int maxLength = -1;
    if (s.isEmpty()) {
        return 0;
    }
   
    else if (s.length() == 1) {
        return 1;
    }
    for (char c : s.toCharArray()) {
        String current = String.valueOf(c);

        
        if (check.contains(current)) {
        	check = check.substring(check.indexOf(current)
                                  + 1);
        }
        check = check + String.valueOf(c);
        maxLength = Math.max(check.length(), maxLength);
    }

    return maxLength;
}
}
