package leetcode;

public class SQRTX {

	public static void main(String[] args) {
		System.out.println(mySqrt(8));
	}
	
	public static int mySqrt(int x) {
    
		long l=1, r =x/2;
		if(x==1)
			return 1;
		while(l<=r) {
			long mid=l+(r-l)/2;
			if(mid*mid==x) {
				return (int)mid;
			}else if(mid*mid>x) {
				r=mid-1;
			} else {
				l=mid+1;
			}
		}
		return (int)r;
    }

}
