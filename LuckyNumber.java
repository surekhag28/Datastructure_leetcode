import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
	
	
	// Brute Force 
	public static List<Integer> luckyNumbers (int[][] matrix) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int idx=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]<=min) {
					min=matrix[i][j];
					idx=j;
				}
			}
			for(int k=0;k<matrix.length;k++) {
				if(max<matrix[k][idx]) {
					max=matrix[k][idx];
				}
			}
			if(min==max)
				list.add(min);
			
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
		}
		System.out.println(list);
		return list;
    }
	
	public static void main(String[] args) {
		int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
		
		luckyNumbers(matrix);
	}

}
