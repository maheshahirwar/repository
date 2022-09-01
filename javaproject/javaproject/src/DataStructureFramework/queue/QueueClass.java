package DataStructureFramework.queue;


public class QueueClass {

	public static void main(String[] args) {
	  MyQueue<Integer>mq = new MyQueue<>();
	  mq.enqueue(43);
	  mq.enqueue(665);
	  mq.enqueue(345);
	  mq.enqueue(87);
	  mq.enqueue(876);
	  mq.printQueue();
	  System.out.println();
	  System.out.println(mq.dequeue());
	  System.out.println(mq.dequeue());
	  System.out.println(mq.dequeue());
	  System.out.println(mq.dequeue());
	  System.out.println(mq.dequeue());
	  System.out.println(mq.dequeue());
	  System.out.println(mq.dequeue());
	  mq.enqueue(5436);
	  System.out.println(mq.dequeue());
	}

}
