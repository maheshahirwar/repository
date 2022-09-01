package CognizantPractice;

public class SpirallyMatrixTraversal {

	public static void main(String[] args) {
		int[][]mat= { {1,2,3,4},
				    {5,6,7,8},
				    {9,10,11,12}};
      int r=mat.length;
      int c=mat[0].length;
      int x=0; 
      int y=0;
      int total=r*c;
      int n=0;
      while(n<total) {
    	 for(int i=0;i<c;i++) { 
    		 if(n==total)break;
    		 System.out.print(mat[x][y]+" ");
    		 n++;
    		 y++;
    	 }
  
    	 y--;
    	 x++;
    	 r--;
    	 c--;
    	 for(int i=0;i<r;i++) {
    		 if(n==total)break;
    		 System.out.print(mat[x][y]+" ");
    		 n++;
    		 x++;
    	 }

    	 x--;
    	 y--;
    	 r--;
    	 for(int i=0;i<c;i++) {
    		 if(n==total)break;
    		 System.out.print(mat[x][y]+" ");
    		 n++;
    		 y--;
    	 }
    
    	 y++;
    	 x--;
    	 c--;
    	 for(int i=0;i<r;i++) {
    		 if(n==total)break;
    		 System.out.print(mat[x][y]+" ");
    		 n++;
    		 x--;
    	 }
    	
    	 x++;
    	 y++;
      }
  }
}
