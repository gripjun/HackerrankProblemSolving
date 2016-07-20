import java.util.ArrayDeque;
//Complete this code or write your own from scratch
import java.util.Deque;
import java.util.Scanner;

class Solution {
	
	static Deque<Character> stack;

	public static boolean isBalanced(String exp) {
		final int len = exp.length();
		boolean failed = false;
		
		for(int i = 0; !failed && i < len; i++) {
			char curChar = exp.charAt(i);
			char counter = '.';
			switch(curChar) {
				case '(':
				case '{':
				case '[':
					stack.push(curChar);
					break;
					
					
				case ')':
					counter = '(';
				case '}':
					if(counter == '.') counter = '{';
				case ']':
					if(counter == '.') counter = '[';
					if(stack.isEmpty() || stack.pop() != counter) {
						failed = true;
					}
					break;
			}
		}
		
		return stack.isEmpty() && !failed;
		
		
		
	}
	
	public static void main(String[] argh) {

		Scanner in = new Scanner(System.in);
		stack = new ArrayDeque<Character>();
		
		while(in.hasNextLine()) {
			String exp = in.nextLine();
			System.out.println(isBalanced(exp));
			stack.clear();
		}
		
	}
}
