import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlidingWindowMaximum {

	public static int[] maxSlidingWindow(int[] nums, int k) {
        
		int[] maxEle = new int[nums.length-k+1];
		List<Integer> list = new ArrayList<Integer>();
		
		int idx=0;
		
		for(int i=0;i<k;i++) {
			list.add(nums[i]);
		}

		//maxEle[idx]=getMax(list);
		
		Collections.sort(list);
		maxEle[idx]=list.get(list.size()-1);

		for(int i=k;i<nums.length;i++) {
			list.add(nums[i]);
			list.remove(0);
			System.out.println(list);
			idx++;
			Collections.sort(list);
			
			maxEle[idx]=list.get(list.size()-1);
		}
		
		display(maxEle);
		return maxEle;
    }
	
	public static int getMax(List<Integer> list) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++) {
			max=Math.max(max, list.get(i));
		}
		return max;
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {7,2,4};
		int k=2;
		maxSlidingWindow(arr,k);

	}
}
