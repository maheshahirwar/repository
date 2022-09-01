package practice;

public class NumberPatten {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			int x=i,y=n-i+1; // Initialization x=1 and y=5(e.g.)
			for(int j=1; j<=n; j++) {
				int print=j%2==1?x:y; // This line check condition odd or even iteration
				x+=n;y+=n; // Each Iteration x and y increased by n
				System.out.print(print+" ");
			}
			System.out.println();}
	}

}
