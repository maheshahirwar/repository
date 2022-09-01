package DataStructureFramework.ArrayDequeOrDoublyEndedQueue;

public class ArrayDequeClass {

	public static void main(String[] args) {
		MyArrayDeque<Integer>arrayDeque = new MyArrayDeque<>();
		arrayDeque.push(45);
		arrayDeque.push(56);
		arrayDeque.push(87);
		arrayDeque.push(34);
		arrayDeque.push(65);
		System.out.println(arrayDeque.pop());
		System.out.println(arrayDeque.pop());
		System.out.println(arrayDeque.pop());
	}

}
