package algorithm.backtracking;
import java.util.*;
public class NQueenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     ArrayList<ArrayList<Integer>>ans=nQueen(n);
//     for(ArrayList<Integer>list:ans) {
//    	 for(int a:list) {
//    		 
//    	 }
//     }
     System.out.println(ans);
	}
	 static ArrayList<ArrayList<Integer>> nQueen(int n) {
         ArrayList<ArrayList<Integer>>ans=new ArrayList<>(); 
	       boolean[][]m=new boolean[n][n];
	       printNQueens(ans,m,0);
	       return ans;
	    }
	 public static void printNQueens(ArrayList<ArrayList<Integer>>ans,boolean[][] chess, int col) {
	        if(col==chess.length){
	            safe(ans,chess);
	            return;
	        }
	        for(int row=0;row<chess.length;row++){
	            if(isSafe(row,col,chess)==true){
	            chess[row][col]=true;
	            printNQueens(ans,chess,col+1);
	            chess[row][col]=false;
	        }
	        }
	    }
	    public static boolean isSafe(int row,int col,boolean[][]chess){
	        for(int c=0;c<chess.length;c++){
	            if(chess[row][c]==true){
	                return false;
	            }
	        }
	        for(int r=0;r<chess.length;r++){
	            if(chess[r][col]==true){
	                return false;
	            }
	        }
	        int r=row;
	        for(int c=col;r>=0&&c<chess.length;r--,c++){
	            if(chess[r][c]==true){
	                return false;
	            }
	        }
	         r=row;
	        for(int c=col;r>=0&&c>=0;r--,c--){
	            if(chess[r][c]==true){
	                return false;
	            }
	        }
	       r=row;
	        for(int c=col;r<chess.length&&c>=0;r++,c--){
	            if(chess[r][c]==true){
	                return false;
	            }
	        }
	        for(int c=col;r<chess.length&&c<chess.length;r++,c++){
	            if(chess[r][c]==true){
	                return false;
	            }
	        }
	       
	        return true;
	    }
	    static void safe(ArrayList<ArrayList<Integer>>ans,boolean[][]chess){
	        ArrayList<Integer>list=new ArrayList<>();
	        for(int i=0;i<chess.length;i++){
	            for(int j=0;j<chess.length;j++){
	                if(chess[j][i]==true){
	                    list.add(j+1);
	                }
	            }
	            
	        }
	        ans.add(list);
	        return;
	    }
}
