package leetcodeproblem;

public class RotateArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		int k=3;
		rotate(a,k);
        for(int it:a) {
        	System.out.print(it+" ");
        }
	}
  public static void rotate(int []nums, int k) {
	  int[]a=new int[nums.length];
	  for(int i=0; i<nums.length; i++) {
		  a[(i+k)%nums.length]=nums[i];
	  }
	  for(int i=0; i<nums.length; i++) {
		  nums[i]=a[i];
	  }
  }
}
