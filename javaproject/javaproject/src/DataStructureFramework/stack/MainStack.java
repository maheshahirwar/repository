package DataStructureFramework.stack;

import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {
	Stack<Integer>stack = new Stack();
	stack.push(34);
	stack.push(54);
	stack.push(65);
	stack.push(12);
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack.search(34));
	int popped = stack.pop();
	System.out.println(popped);
	    popped = stack.pop();
	System.out.println(popped);
		  popped = stack.pop();
	System.out.println(popped);
     System.out.println(stack);
     
	}

}
