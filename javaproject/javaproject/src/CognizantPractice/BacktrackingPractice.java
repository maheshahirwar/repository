package CognizantPractice;

import java.util.ArrayList;

public class BacktrackingPractice {

	public static void main(String[] args) {
		
		
//		int[][]mat={{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
//                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
//                {1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
//                {0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
//                {1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
//                {1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
//                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
//                {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
//                {1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }};
//		System.out.println(shortestPath(mat,0,0,3,4));
		
		int[]a= {2,1,2,3,4,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		ArrayList<Integer>ans=new ArrayList<>();
		boolean isPossible= (sum&1)==0&&partition(a,sum/2,0,ans);
		if(isPossible) {
			for(int it:ans) {
				System.out.print(it+" ");
			}
		}else {
			System.out.println("Not possible");
		}
	}
// Shorted path in a maze
  static int  shortestPath(int[][]a,int i,int j, int x, int y){
	   int row=a.length;
	   int col=a[0].length;
	   boolean vis[][]=new boolean[row][col];
	   return shortPath(a,i,j,x,y,vis);
   }
  static int shortPath(int[][]a,int i, int j,int x, int y, boolean[][]vis) {
	  if(!isValid(a,i,j,vis))return 100000;
	  if(i==x&&j==y)return 0;
	  vis[i][j]=true;
	  
	  int left=shortPath(a,i,j-1,x,y,vis)+1;
	  int bottom=shortPath(a,i+1,j,x,y,vis)+1;
	  int right=shortPath(a,i,j+1,x,y,vis)+1;
	  int top=shortPath(a,i-1,j,x,y,vis)+1;
	  vis[i][j]=false;
	  return Math.min(Math.min(left, bottom), Math.min(top, right));
  }
  static boolean isValid(int[][]a,int i,int j,boolean[][]vis) {
	  int row=a.length;
	  int col=a[0].length;
	  return i>=0&&j>=0&&i<row&&j<col&&a[i][j]==1&&!vis[i][j];
  }
  
  
  // partition of array sum equal into two
  static  boolean partition(int[]a,int sum,int i,ArrayList<Integer>ans){
    	if(i>=a.length||sum<0)return false;
    	if(sum==0)return true;
    	ans.add(a[i]);
    	boolean leftPossible=partition(a,sum-a[i],i+1,ans);
    	if(leftPossible)return true;
    	ans.remove(ans.size()-1);
    	return partition(a,sum,i+1,ans);
    }
}
