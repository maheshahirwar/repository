package practice;

import java.util.*;

public class FindMedianInAStream {
  static PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder());
  static PriorityQueue<Integer>min=new PriorityQueue<>();
	public static void main(String[] args) {
		int[]a= {5,15,1,3};
		for(int it:a) {
            insertHeap(it);
            System.out.println(getMedian());
		}
		
	}
	 public static void insertHeap(int x)
	    {
	        if(max.size()==0||x<max.peek()){
	            max.add(x);
	        }else{
	            min.add(x);
	        }
	        balanceHeaps();
	    }
	  public static void balanceHeaps()
	    {
	       PriorityQueue<Integer>bigHeap=max.size()>min.size()?max:min;
	       PriorityQueue<Integer>smallHeap=max.size()>min.size()?min:max;
	       if(bigHeap.size()-smallHeap.size()>1){
	           smallHeap.offer(bigHeap.poll());
	       }
	    }
	  public static double getMedian()
	    {
	       PriorityQueue<Integer>bigHeap=max.size()>min.size()?max:min;
	       PriorityQueue<Integer>smallHeap=max.size()>min.size()?min:max;
	       if(bigHeap.size()==smallHeap.size()){
	           return ((double)bigHeap.peek()+smallHeap.peek())/2;
	       }else{
	           return bigHeap.peek();
	       }
	    }
	      
}
