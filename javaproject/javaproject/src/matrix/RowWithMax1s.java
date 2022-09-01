package matrix;

public class RowWithMax1s {

	public static void main(String[] args) {
		int[][]arr= { {0,0,0,1,1}, 
		              {0,0,1,1,1},
		              {0,1,1,1,1},
		              {1,1,1,1,1},
		              {0,0,0,0,0} };
		int n=arr.length;
		int m=arr[0].length;
		System.out.println(rowWithMax1s(arr,n,m));

	}
	 static int rowWithMax1s(int arr[][], int n, int m) {
	     int row;
	     for(int i=0; i<m; i++){
	         row=0;
	         while(row<n){
	             if(arr[row][i]==1){
	                 return row;
	             }else{
	                 row++;
	             }
	         }
	     }
	     return-1;
	    }
}
