package DSApractice;

public class Queue {

	public static void main(String[] args) {
		MyQueue queue=new MyQueue(5);
		queue.enqueue("Mahesh");
		queue.enqueue("Deepak");
		queue.enqueue("Rahul");
		queue.enqueue("hasd");
    queue.display();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    System.out.println();
    queue.display();
	}

}
class MyQueue{
	private int front,rear,maxSize;
	String data;
	String[]a;
	MyQueue(int maxSize){
		this.data=data;
		this.front=0;
		this.rear=-1;
		this.maxSize=maxSize;
		a=new String[maxSize];
	}
	public boolean enqueue(String data) {
		if(isFull()) {
			return false;
		}else {
			a[++rear]=data;
			return true;
		}
	}
	private boolean isFull() {
	    if(rear==maxSize-1) {
	    	return true;
	    }
		return false;
	}
	public void display() {
		for(int i=front; i<=rear; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public String dequeue() {
		if(isEmpty()) {
			return "empty";
		}else {
			return a[front++];
		}
	}
	private boolean isEmpty() {
		if(front>rear) {
			return true;
		}
		return false;
	}
}