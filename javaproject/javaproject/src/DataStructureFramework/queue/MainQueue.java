package DataStructureFramework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) {
		Queue<Integer>queue = new LinkedList<>();
		queue.add(23);
		queue.add(433);
		queue.add(234);
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue.element());
	    queue.offer(23);
	    queue.offer(23);
	    queue.offer(654);
	    queue.offer(655);
       System.out.println(queue);
       System.out.println(queue.peek());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
	}

}
