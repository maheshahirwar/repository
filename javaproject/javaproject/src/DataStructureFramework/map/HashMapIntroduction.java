package DataStructureFramework.map;

import java.util.*;
import java.util.Map;

public class HashMapIntroduction {

	public static void main(String[] args) {
		Map<String,Integer>num=new HashMap<>();
		num.put("one", 1);
		num.put("two", 2);
		num.put("five", 5);
		num.put("four", 4);
		System.out.println(num);
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.entrySet());
		

		  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(99,"Rahul");  
		  System.out.println(hm);
		for(Map.Entry m:hm.entrySet()){  
		   System.out.print(m.getKey()+" "+m.getValue()+" ");  
		  }  
		System.out.println();
		Map<Integer,String>tm=new TreeMap<Integer,String>();
		tm.put(24, "fdgfgdh");
		tm.put(67, "fhhddf");
		tm.put(1, "Mahesh");
		tm.put(45, "Rahul");
		tm.put(23, "Deepak");
		for(Map.Entry m:tm.entrySet()) {
			System.out.print(m.getKey()+" "+m.getValue()+" ");
		}
	}

}
