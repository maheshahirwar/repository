package DataStructureFramework.ArrayDequeOrDoublyEndedQueue;

import java.util.ArrayDeque;

public class MainArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer>ad=new ArrayDeque<>();
        ad.push(12);
        ad.push(24);
        ad.push(36);
        System.out.println(ad.pop());
        System.out.println(ad.pop());
	}

}
