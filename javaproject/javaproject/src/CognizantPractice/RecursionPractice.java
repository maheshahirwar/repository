package CognizantPractice;

public class RecursionPractice {

	public static void main(String[] args) {
		
		//System.out.println(sum(5));
		//System.out.println(power(5,2));
		//System.out.println(gcd(12,6));
//		int[][]mat= {
//				{1,1,1,2,1,1,1},
//				{1,2,2,2,2,1,1},
//				{1,1,2,2,0,0,1},
//				{1,1,1,2,2,0,0},
//				{1,1,2,2,1,1,0}
//		};
//		floodfill(mat,0,0,3,1);
//		for(int i=0;i<mat.length;i++) {
//			for(int j=0;j<mat[i].length;j++) {
//				System.out.print(mat[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		String s="abca";
//		int n=s.length()-1;
//		permutation(s,0,n);
		
		int[]a= {1,5,7,3,2,4};
		System.out.println(maxCoin(a,0,a.length-1));
	}
	
	
	// sum of natural number
     static int sum(int n) {
	if(n==1)return 1;
	return sum(n-1)+n;
    }
     
    // power of two number
     static int power(int a,int b) {
    	 if(b==1)return a;
    	 return power(a,b-1)*a;
     }
     
    // GCD of two number
      static int gcd(int a, int b) {
    	 if(b==0)return a;
    	 if(a==0)return b;
    	 if(a==b)return a;
    	 if(a>b)
    		 return gcd(a-b,b);
    	 return gcd(a,b-a);
         }
      
    //flood fill matrix problem asked in google, microsoft
      static void floodfill(int[][]a, int r, int c, int tofill, int prevfill) {
    	  int row=a.length;
    	  int col=a[0].length;
    	  if(r<0||c<0||r>=row||c>=col) {
    		  return;
    	  }
    	  if(a[r][c]!=prevfill||a[r][c]==tofill) {
    		  return;
    	  }
    	  a[r][c]=tofill;
    	  floodfill(a,r-1,c,tofill,prevfill);
    	  floodfill(a,r,c-1,tofill,prevfill);
    	  floodfill(a,r,c+1,tofill,prevfill);
    	  floodfill(a,r+1,c,tofill,prevfill);
    	  return;
      }
      
      // permutation of string
     static void permutation(String s,int l,int r) {
    	  
    	  if(l==r) {
    		  System.out.print(s+" ");
    		  return;
    	  }
    	  for(int i=l;i<=r;i++) {
    		 s= swap(s,l,i);
    		  permutation(s,l+1,r);
    		  s=swap(s,l,i);
    	  }
    	  
      }
      static String swap(String s, int a, int b) {
    	  char[]c=s.toCharArray();
    	  char temp=c[a];
    	  c[a]=c[b];
    	  c[b]=temp;
    	  return String.valueOf(c);
      }
      
      
      //game theory imp question 
    static int maxCoin(int[]a,int l,int r){
    	  if(l+1==r) {
    		  return Math.max(a[l], a[r]);
    	  }
    	  return Math.max(a[l]+Math.min(maxCoin(a,l+2,r), maxCoin(a,l+1,r-1)), 
    			  a[r]+Math.min(maxCoin(a,l+1,r-1),maxCoin(a,l,r-2)));
      }
     }    

