import java.util.ArrayList;
import java.util.List;

public class FlipImage {
	
	
	// Brute Force 
	public static int[][] flipAndInvertImage(int[][] A) {
     
		for(int i=0;i<A.length;i++) {
			int low=0,high=A[i].length-1;
			while(low<=high) {
				int temp=A[i][low];
				A[i][low]=1-A[i][high];
				A[i][high]=1-temp;
				low++;high--;
			}
		}
		display(A);
		return A;
    }
	
	public static void display(int[][] A) {
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,1,0},{1,0,1},{0,0,0}};
		
		flipAndInvertImage(matrix);
	}

}

