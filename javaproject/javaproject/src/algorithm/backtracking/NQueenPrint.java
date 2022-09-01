package algorithm.backtracking;
import java.util.*;
public class NQueenPrint {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int[][]a=new int[n][n];
	    	  if(printNQueens(a,0)) {
		    	  for(int i=0;i<n;i++) {
			    	  for(int j=0;j<n;j++) {
			    		  System.out.print(a[i][j]+", ");
			    	  }
			    	  System.out.println();
		    	  }
	      }
	      
	    
	    }

	    public static boolean printNQueens(int[][] chess,int row) {
	        if(row>=chess.length){
	            return true;
	        }
	        for(int i=0;i<chess.length;i++){
	            if(isSafe(chess,row,i)==true){
	            chess[row][i]=1;
	            if(printNQueens(chess,row+1)) {
	            	return true;
	            }
	            chess[row][i]=0;
	        }
	           
	        }
	        return false;
	    }
	    public static boolean isSafe(int[][]chess,int row,int col){
	        for(int i=row-1,j=col;i>=0;i--){
	            if(chess[i][j]==1){
	                return false;
	            }
	        }
	        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
	            if(chess[i][j]==1){
	                return false;
	            }
	        }
	        for(int i=row-1,j=col+1;i>=0&&j<chess[0].length;i--,j++){
	            if(chess[i][j]==1){
	                return false;
	            }
	        }
	        return true;
	    }
	}
