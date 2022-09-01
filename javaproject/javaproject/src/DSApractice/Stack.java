package DSApractice;

public class Stack {

	public static void main(String[] args) {
	MyStack stack = new MyStack(5);
	stack.push(54);
	stack.push(43);
	stack.push(76);
	stack.push(23);
   stack.display();
  // System.out.println(stack.peek());
   stack.pop();
   stack.pop();
   stack.pop();
  
   //System.out.println(stack.pop());
   System.out.println();
  stack.display();
 //  System.out.println(stack.peek());
	}
}
class MyStack{
	private int top;
	private int maxSize;
	int[]a;
	MyStack(int maxSize){
		this.top=-1;
		this.maxSize=maxSize;
		a=new int[maxSize];
	}
	public boolean push(int data) {
		if(isFull()) {
			return false;
		}else {
			a[++top]=data;
			return true;
		}
	}
	private boolean isFull() {
		if(top>=(maxSize-1)) {
			return true;
		}
		return false;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			for(int i=top; i>=0; i--) {
				System.out.print(a[i]+" ");
			}
		}
	}
	private boolean isEmpty() {
		if(top<0) {
			return true;
		}
		return false;
	}
	public int peek() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}else {
			return a[top];
		}
	}
	public int pop() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}else {
			return a[top--];
		}
	}
}