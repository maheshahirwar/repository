package DataStructureFramework.heap;
import java.util.*;
public class MaxHeapImplement {

	public static void main(String[] args) {
	   ArrayList<Integer>array=new ArrayList<>();
	   int n=array.size();
	   Heap p=new Heap();
	   System.out.println("Insert Element :");
	   p.insert(array,3);
	   p.insert(array,9);
	   p.insert(array,2);
	   p.insert(array,1);
	   p.insert(array,4);
	   p.insert(array,5);
	   p.insert(array,7);
	   System.out.println("Print heap after heapify: ");
	   p.print(array);
	   System.out.println("After delet element 5 :");
	   p.delect(array, 5);
	   p.print(array);
	}

}
