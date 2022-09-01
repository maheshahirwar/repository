package DataStructureFramework.priorityQueue;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		//PriorityQueue<String>pq=new PriorityQueue<>();
		PriorityQueue<Integer>pq=new PriorityQueue<>();
//        pq.add("Banana");
//        pq.add("Apple");
//        pq.add("Mango");
//        pq.add("Kiwi");
		pq.add(23);
		pq.add(12);
		pq.add(65);
		pq.add(54);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
	}

}
