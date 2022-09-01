package DataStructureFramework.stack;

public class MainClass {

	public static void main(String[] args) throws Exception {
		MyStack<Integer>stack = new MyStack<>();
		stack.push(34);
		stack.push(23);
		stack.push(55);
		stack.push(21);
		stack.printStack();
		System.out.println();
		int pop = stack.pop();
		System.out.println(pop);
		System.out.println(stack.peek());
	}

}
