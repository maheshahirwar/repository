package DataStructureFramework.map;
import java.util.*;
public class MapPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    Map<String,Integer>map=new HashMap<String,Integer>();
		   int n=sc.nextInt();
		    for(int i=0; i<n; i++){
		        String k=sc.next();
		         int v=sc.nextInt();
		        map.put(k,v);
		    }
		    String search =sc.next();
		      if(map.containsKey(search)){
		       System.out.println(map.get(search));
		    }else{
		        System.out.println(-1);
		    }
		}
	}

}
