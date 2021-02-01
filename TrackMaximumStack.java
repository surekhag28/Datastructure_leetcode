package stack;

import java.util.Stack;

public class TrackMaximumStack {
	
	public static void getMax(int[] arr) {
		
		Stack<Integer> eleStack = new Stack<Integer>();
		Stack<Integer> maxStack = new Stack<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			eleStack.push(arr[i]);
			
			if(eleStack.size()==1)
				maxStack.push(arr[i]);
			else {
				if(arr[i]>maxStack.peek())
					maxStack.push(arr[i]);
				else
					maxStack.push(maxStack.peek());
			}
		}
		System.out.println(maxStack);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,19,7,14,20};
		getMax(arr);
	}

}
