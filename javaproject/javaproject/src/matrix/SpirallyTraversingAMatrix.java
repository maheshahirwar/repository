package matrix;
import java.util.*;
public class SpirallyTraversingAMatrix {

	public static void main(String[] args) {
	int [][]matrix= {{1,2,3,4},
			         {5,6,7,8},
			         {9,10,11,12}};	
	int r=3,c=4;
	ArrayList<Integer>ans=new ArrayList<>();
	ans=spirallyTraverse(matrix,r,c);
	for(int it:ans) {
		System.out.print(it+" ");
	}
     
	}
	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
		ArrayList<Integer>ans=new ArrayList<>();
		int n=0,x=0,y=0,total=r*c;
		while(n!=total) {
			for(int i=0; i<c; i++) {
				if(n==total)break;
				ans.add(matrix[x][y]);
				y++;
				n++;
			}
			y--;
			x++;
			r--;c--;
			for(int i=0; i<r; i++) {
				if(n==total)break;
				ans.add(matrix[x][y]);
				x++;
				n++;
			}
			x--;
			y--;
			r--;
			for(int i=0; i<c; i++) {
				if(n==total)break;
				ans.add(matrix[x][y]);
				y--;
				n++;
			}
			y++;
			c--;
			x--;
			for(int i=0; i<r; i++) {
				if(n==total)break;
				ans.add(matrix[x][y]);
				x--;
				n++;
			}
			x++;
			y++;
			
		}
		return ans;
    }
}
