package DSApractice;
import java.util.*;
public class SetMethodIntro {

	public static void main(String[] args) {
	Set<Integer>set=new TreeSet<>();
	// add() method in set
	set.add(23);
	set.add(32);
	set.add(12);
	set.add(65);
     System.out.println(set);
     // remove() method in set
     set.remove(12);
     System.out.println(set);
     Set<Integer>set1=new HashSet<>();
     set1.add(23);
     set1.add(75);
     set1.add(12);
     set1.add(65);
     set1.add(87);
     System.out.println(set1);
     // union operation addAll() method in set
     set.addAll(set1);
     System.out.println(set);
     // intersection operation retainAll() method in set
//     set.retainAll(set1);
//     System.out.println(set);
	}

}
