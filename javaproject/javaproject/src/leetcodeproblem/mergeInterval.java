package leetcodeproblem;
import java.util.*;
public class mergeInterval {

	public static void main(String[] args) {
      int[][]a= {{1,3},{2,6},{8,10},{15,18}};
      int [][]ar=merge(a);
      for(int i=0; i<ar.length; i++) {
    	  for(int j=0; j<ar[i].length; j++) {
    		  System.out.print(ar[i][j]+" ");
    	  }
    	  System.out.println();
      }
	}
public static  int[][] merge(int[][]intervals){
	if(intervals==null|| intervals.length<=1)
		{return intervals;}
	Arrays.sort(intervals, new Comparator<int[]>() {
		@Override
		public int compare(int a[], int []b) {
			if(a[0]==b[0]) {
				return b[1]-a[1];
			}else {
				return a[0]-b[0];
			}
		}
	});
	List<int[]>result=new ArrayList<>();
	int[]prev=intervals[0];
	for(int i=1; i<intervals.length; i++) {
		int[]arr=intervals[i];
		if(prev[1]>=arr[0]) {
			prev[1]=Math.max(arr[1],prev[1]);
		}else {
			result.add(prev);
			prev=arr;
		}
		if(i==intervals.length-1) {
			result.add(prev);
		}
	}
	int[][]ans=new int[result.size()][2];
	for(int i=0; i<result.size(); i++) {
		ans[i]=result.get(i);
	}
	return ans;
	
}
}
