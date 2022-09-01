package DataStructureFramework.set;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
	Set<String>set=new HashSet<>();
	set.add("Banana");
	set.add("Apple");
	set.add("Kiwi");
	set.add("Orange");
	set.add("Banana");
	set.add("Kiwi");
	System.out.println(set);
	Set<String>set1=new LinkedHashSet<>();
	set1.add("Graps");
	set1.add("Kiwi");
	set1.add("Banana");
	set1.add("Apple");
	set1.add("Orange");
	System.out.println(set1);
	Set<String>set2=new TreeSet<>();
	set2.add("Mango");
	set2.add("Kiwi");
	set2.add("Graps");
	set2.add("Banana");
	set2.add("Apple");
	set2.add("Orange");
	System.out.println(set2);
//		Set<Integer>x=new TreeSet<>();
//	x.add(43);
//	x.add(23);
//	x.add(12);
//	System.out.println(x);
//	Set<Integer>y=new LinkedHashSet<>();
//	y.add(12);
//	y.add(42);
//	y.add(1);
//	System.out.println(y);
//	x.addAll(y);
//		System.out.println(x);
	
//	for(String it:set2) {
//		System.out.print(it+" ");
//	}
	}
	

}
