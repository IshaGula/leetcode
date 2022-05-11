package leetcode;

public class MinCoinChange {

	public static void main(String[] args) {
		System.out.println(coinChange(new int[] {2}, 3));
	}
	
	public static int coinChange(int[] coins, int amount) {
		int n = coins.length;
		int[][] coinT = new int[n+1][amount+1];
		for(int i = 0;i<=n;i++) {
			for(int j =0;j<=amount;j++) {
				if(j==0) {
					coinT[i][j]=0;
				}else if(i==0) {
					coinT[i][j]=Integer.MAX_VALUE;
				}else if(j<coins[i-1]) {
					coinT[i][j]=coinT[i-1][j];
				}else {
					int x = 1+coinT[i][j-coins[i-1]];
					if(x<0) {
						x=Integer.MAX_VALUE;
					}
					coinT[i][j]=Math.min(x,coinT[i-1][j]);
				}
			}
		}
		return (coinT[n][amount]>=Integer.MAX_VALUE)?-1:coinT[n][amount];
		}

}
