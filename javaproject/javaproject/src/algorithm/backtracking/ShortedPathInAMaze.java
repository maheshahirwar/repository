package algorithm.backtracking;
import java.util.*;
public class ShortedPathInAMaze {

	public static void main(String[] args) {
	int[][]a= {{1,-1,-1,-1},
	           {0,0,0,0},
	           {0,0,-1,0},
	           {0,0,-1,2}};
	int n=a.length;
	int m=a[0].length;
	int result=shortestPath(a,0,0,n-1,m-1);
	System.out.println(result);
  }
	static int shortestPath(int[][]a, int i, int j, int x, int y) {
		int rows=a.length;
		int cols=a[0].length;
		boolean vis[][]=new boolean[rows][cols];
		return shortestPath(a,i,j,x,y,vis);
	}
	static boolean isValid(int[][]a, int i, int j, boolean[][]vis) {
		int rows=a.length;
		int cols=a[0].length;
		return i>=0 && j>=0 && i<rows && j<cols && a[i][j]==0 && 
				!vis[i][j];
	}
	static int shortestPath(int[][]a, int i, int j, int x, int y, boolean[][]vis) {
		if(!isValid(a, i, j, vis))return 1000000000;
		if(i==x && j==y) return 0;
	  vis[i][j]=true;
	  int left=shortestPath(a,i,j-1, x, y, vis)+1;
	  int bottom=shortestPath(a,i+1,j,x,y, vis)+1;
	  int right=shortestPath(a,i,j+1, x,y,vis)+1;
	  int top=shortestPath(a,i-1,j, x,y,vis)+1;
	 // this line backtracking work
	  vis[i][j]=false; 
	  return Math.min(Math.min(left, bottom), Math.min(right, top));
	}
	
}
