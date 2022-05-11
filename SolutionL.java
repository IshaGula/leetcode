package leetcode;

public class SolutionL {

static int closestToZero(int[] ints) {
	 int minValue = Integer.MAX_VALUE, closeToZero = 0;
     for(int i =0;i<ints.length;i++) {
         if(minValue > Math.abs(ints[i])) {
        	 minValue = Math.abs(ints[i]);
        	 closeToZero = ints[i];
         } else if(Math.abs(closeToZero) == ints[i]) {
        	 closeToZero = ints[i];
         }
     }
     return closeToZero;
	}

public static void main(String[] args) {
	System.out.println(closestToZero(new int[] {-9, 8, 2, -1,1}));
}
}


//int[] charA= new int[256];
//int[] charB= new int[256];
//
//a=a.toLowerCase();
//b=b.toLowerCase();
//
//for(int i=0;i<a.length();i++)
//{
//	charA[a.charAt(i)]++;
//}
//
//for(int i=0;i<b.length();i++)
//{
//	charB[b.charAt(i)]++;
//}
//	
//for(int i=0;i<charA.length;i++)
//{
//	if(charA[i]!=charB[i])
//		return false;
//}
//
//return true;
//}