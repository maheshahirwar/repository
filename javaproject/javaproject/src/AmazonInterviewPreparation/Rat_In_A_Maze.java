package AmazonInterviewPreparation;
import java.util.*;
public class Rat_In_A_Maze {

	public static void main(String[] args) {
     int[][]grid= { {1,0,0,0},
    		        {1,1,0,1},
    		        {1,1,0,0},
    		        {0,1,1,1} };	
     int n=grid.length;
     ArrayList<String>ans=new ArrayList<>();
     int[][]vis=new int[n][n];
     int[]row= {1,0,0,-1};
     int[]col= {0,-1,1,0};
     if(grid[0][0]==1)solve(0,0,row,col,grid,n,ans,"",vis);
     System.out.println(ans);
	}
public static void solve(int i,int j,int[]row,int[]col,int[][]grid,int n,ArrayList<String>ans,String path,int[][]vis) {
	if(i==n-1&&j==n-1) {
		ans.add(path);
		return;
	}
	String dir="DLRU";
	for(int ind=0;ind<4;ind++) {
		int r=i+row[ind];
		int c=j+col[ind];
		if(r>=0&&c>=0&&r<n&&c<n&&vis[r][c]==0&&grid[r][c]==1) {
			vis[i][j]=1;
			solve(r,c,row,col,grid,n,ans,path+dir.charAt(ind),vis);
			vis[i][j]=0;
		}
	}
}
}
