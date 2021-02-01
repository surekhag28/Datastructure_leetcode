package stack;

import java.util.Stack;

public class ReverseNumberStack {

	public static int reverse(int num) {
		Stack<Integer> stack = new Stack<Integer>();
		int revnum=0;
		
		String s = String.valueOf(num);
		for(int i=0;i<s.length();i++) {
			stack.push(Character.getNumericValue(s.charAt(i)));
		}
		
		while(!stack.isEmpty()) {
			int d = stack.pop();
			revnum=revnum*10+d;
		}

		return revnum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=365;
		System.out.println(reverse(num));
	}

}
