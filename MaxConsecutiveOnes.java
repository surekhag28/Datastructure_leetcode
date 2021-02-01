
public class MaxConsecutiveOnes {

	public static int longestOnes(int[] A, int K) {
	    
		int left=0;
		int max=Integer.MIN_VALUE;
		int zerosCount=0;
		
		for(int i=0;i<A.length;i++) {
			if(A[i]==0)
				zerosCount++;
			
			while(left<=i && zerosCount>K) {
				if(A[left]==0)
					zerosCount--;
				left++;
			}
			
			max=Math.max(max, i-left+1);
		}
		return max;
	  }

	public static void main(String[] args) {

		int[] A = {1,1,0,1,1,1};
		int k=3;
		System.out.println(longestOnes(A,k));
	}

}
