package practice;

public class Sort {

	public static void main(String[] args) {
	int []a= {1,0,0,2,1,2,0,0,1,2,1};
      int l=0,m=0,h=a.length-1;
      while(m<=h) {
      switch(a[m]) {
      case 0:
    	  int temp=a[m];
    	  a[m]=a[l];
    	  a[l]=temp;
    	  l++;
    	  m++;
    	  break;
      case 1:
    	  m++;
    	  break;
      case 2:
    	  int temp1=a[m];
    	  a[m]=a[h];
    	  a[h]=temp1;
    	  h--;
    	  break;
      }
      }
      for(int it:a) {
    	  System.out.print(it+" ");
      }
	}

}
