package leetcode;

public class Add2NumbersBitManipulation {

	public static void main(String[] args) {
		System.out.println(getSum(15, 32));
	}

	 public static int getSum(int a, int b) {
		 while (b != 0)
	        {
	            int carry = a & b;
	            a = a ^ b;
	            b = carry << 1;
	        }
	        return a;
	 }
}
