package DataStructureFramework.heap;

import java.util.ArrayList;

public class Heap {
	
   public void insert(ArrayList<Integer>array,int newNode) {
    	int size=array.size();
    	if(size==0) {
    		array.add(newNode);
    	}else {
    		array.add(newNode);
    		for(int i=size/2-1;i>=0;i--) {
    			heapify(array,i);
    		}
    	}
    }
    void heapify(ArrayList<Integer>array,int i) {
    	int largest=i;
    	int left=2*i+1;
    	int right=2*i+2;
    	int size=array.size();
    	if(left<size&&array.get(left)<array.get(largest)) {
    		largest=left;
    	}
    	if(right<size&&array.get(right)<array.get(largest)) {
    		largest=right;
    	}
//       int parent=(i-1)/2;
//       if(i>0&&array.get(parent)<array.get(i)) {
    	if(largest!=i) {
    		int temp=array.get(largest);
    		array.set(largest, array.get(i));
    		array.set(i, temp);
    		heapify(array,largest);
	}
       }
    
    void delect(ArrayList<Integer>array,int num) {
    	int size=array.size();
    	int i;
    	
    	for(i=0;i<size;i++) {
    		if(num==array.get(i))break;
    	}
    	int temp=array.get(i);
    	array.set(i, array.get(size-1));
    	array.set(size-1, temp);
    	array.remove(size-1);
    	for(int j=size/2-1;j>=0;j--) {
    		heapify(array,j);
    	}
    	
    }
    void print(ArrayList<Integer>array) {
    	for(int it:array) {
    		System.out.print(it+" ");
    	}
    }
}
