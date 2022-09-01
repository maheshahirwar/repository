package practice;

public class MoveAllNegativeNumbersBegning {

	public static void main(String[] args) {
	int[]a= {-12,11,-13,6,-5,7,-6,5,-4,8};
     int j=0;
     for(int i=0;i<a.length;i++) {
    	 if(a[i]<0) {
    		 if(i!=j) {
    			 int temp=a[i];
    			 a[i]=a[j];
    			 a[j]=temp;
    		 }
    		 j++;
    	 }
     }
     for(int it:a) {
    	 System.out.print(it+" ");
     }
	}

}
