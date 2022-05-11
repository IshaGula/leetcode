package leetcode;

public class SellBuyStockSecond {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {7,6,4,3,1}));

	}
	
public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,maxP=0;
        for(int i:prices) {
        	if(i<min) {
        		min=i;
        	}else {
        		maxP+=i-min;
        		min=i;
        	}
        }
        return maxP;
    }

}
