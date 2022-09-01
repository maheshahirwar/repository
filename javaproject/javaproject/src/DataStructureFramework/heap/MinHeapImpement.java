package DataStructureFramework.heap;
import java.util.*;
public class MinHeapImpement {

	public static void main(String[] args) {
		ArrayList<Integer>array=new ArrayList<>();
		 System.out.println("Insert Element :");
		 HeapMin hm=new HeapMin(); 
		   hm.insert(array,3);
		   hm.insert(array,4);
		   hm.insert(array,9);
		   hm.insert(array,5);
		   hm.insert(array,2);
		   hm.insert(array,1);
		   System.out.println("Print heap after heapify: ");
		   hm.print(array);
//		   System.out.println("After delet element 5 :");
//		   hm.delect(array, 5);
//		   hm.print(array);
	}

}
