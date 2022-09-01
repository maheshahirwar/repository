package practice;

import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> al=new HashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.print(itr.next()+" ");  
		  }
		  System.out.println();
		  System.out.println("linked hash set : ");
		  // linked
		  LinkedHashSet<String> al2=new LinkedHashSet<String>();  
		  al2.add("Bavi");  
		  al2.add("Cijay");  
		  al2.add("Bavi");  
		  al2.add("Ajay");  
		  
		  Iterator<String> itr2=al2.iterator();  
		  while(itr2.hasNext()){  
		   System.out.print(itr2.next()+" ");  
		  }  
       System.out.println();
		  System.out.println("TreeSet:");
		  TreeSet<String>al3=new TreeSet<String>();
       al3.add("Savi");
       al3.add("Cijay");  
       al3.add("Savi");  
	   al3.add("Ajay");  
	   
	   Iterator<String>itr3=al3.iterator();
	   while(itr3.hasNext()) {
		   System.out.print(itr3.next()+" ");
	   }
	}

}
