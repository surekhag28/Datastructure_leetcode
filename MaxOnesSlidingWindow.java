
public class MaxOnesSlidingWindow {

	public static int findMaxConsecutiveOnes(int[] nums) {
        
		int max=Integer.MIN_VALUE;
		int count=0;
		
		if(nums.length==0)
			return 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1)
				count++;
			else {
				max=Math.max(max, count);
				count=0;
			}
		}
		
		return Math.max(max, count);
    }
	
	public static void main(String[] args) {
		int[] arr = {0,0,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}
}
