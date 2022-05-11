package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AssessmentJava {

public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> s1 = new HashSet<String>(Arrays.asList(names1));
        Set<String> s2 = new HashSet<String>(Arrays.asList(names2));
        s1.addAll(s2);
        return s1.toArray(new String[s1.size()]);
        
    }
    
    public static void main(String[] args) {
//        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
//        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
//        String[] c = uniqueNames(names1, names2); // should print Ava, Emma, Olivia, Sophia
//        for(String s:c) {
//        	System.out.print(s+" ");
//        }
    	
    		System.out.println(1<<2);
    }

}


