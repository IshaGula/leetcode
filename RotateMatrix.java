package leetcode;

public class RotateMatrix {

	public static void main(String[] args) {
		rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});

	}
	
	public static void rotate(int[][] matrix) {
		int temp;    
		for(int i =0;i<matrix.length;i++) {
			for(int j =0;j<i;j++) {
				temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		
			}
		
		for(int i =0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length/2;j++) {
				temp = matrix[i][j];
				matrix[i][j]=matrix[i][matrix.length-j-1];
				matrix[i][matrix.length-j-1] = temp;
			}
		}
		System.out.println("check");    
	}

	
}
