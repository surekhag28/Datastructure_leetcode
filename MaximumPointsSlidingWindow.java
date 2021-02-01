
public class MaximumPointsSlidingWindow {

	public static void main(String[] args) {

		MaximumPointsSlidingWindow maxS = new MaximumPointsSlidingWindow();
		Solution s = maxS.new Solution();
		int[] cardPoints = {100,40,17,9,73,75};
		int k=3;
		System.out.println(s.maxScore(cardPoints, k));
	}

	class Solution {
	    public int maxScore(int[] cardPoints, int k) {
	        
	    	int max=Integer.MIN_VALUE;
	    	
	    	int frontSum=0;
	    	int backSum=0;
	    	
	    	int front=0;
	    	int back=cardPoints.length-1;
	    	
	    	for(int i=0;i<k;i++) {
	    		frontSum+=cardPoints[front];
	    		front++;
	    	}
	    	max=Math.max(max, frontSum);
	    	
	    	for(int i=0;i<k;i++) {
	    		backSum+=cardPoints[back--];
	    		frontSum-=cardPoints[--front];
	    		max=Math.max(max, frontSum+backSum);
	    	}
	    	
	    	return max;
	    }
	}
}
