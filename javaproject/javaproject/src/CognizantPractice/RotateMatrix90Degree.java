package CognizantPractice;

public class RotateMatrix90Degree {

	public static void main(String[] args) {
		int[][]mat= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int r=mat.length;
		int c=mat[0].length;
		//transport matrix
		for(int i=0;i<r;i++) {
			for(int j=i;j<c;j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
	  //reverse row wise
		for(int i=0;i<r;i++) {
			reverse(mat[i]);
		}
		//print rotate matrix
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
static void reverse(int[]a) {
	int i=0;int j=a.length-1;
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
}
}
