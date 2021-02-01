package stack;

import java.util.Stack;

public class ValidParanthesisCheck {

	public static boolean checkDuplicate(String s) {
	
		char[] arr = s.toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch:arr) {
			if(ch==')') {
				int count=0;
				while(stack.peek()!='(') {
					count++;
					stack.pop();
				}
				stack.pop();
				if(count<1)
					return true;
			}else {
				stack.push(ch);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "((a+(b))+(c+d))";
		System.out.println(checkDuplicate(s));
	}

}
