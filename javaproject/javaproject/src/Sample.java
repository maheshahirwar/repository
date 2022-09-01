import java.util.*;
public class Sample {

	public static void main(String[] args) {
		 List<Integer>Arr=new ArrayList<>();
		 Arr.add(1);
		 Arr.add(1);
		 Arr.add(3);
		 Arr.add(2);
		 Arr.add(4);
		 Arr.add(2);
		 //public static int numOfOperation(int N,List<Integer>Arr){
		   
		 PriorityQueue<Integer>q=new PriorityQueue<>();
		 for(int a:Arr)q.add(a);
		 int ans=0;
		 while(q.size()!=1){
		     int ele=q.poll();
		     int ele1=q.peek();
		     if(ele==ele1){
		      ans++;
		      q.poll();
		      q.add(ele+ele1);
		     }
		 }
		System.out.println(ans);
		}

}
