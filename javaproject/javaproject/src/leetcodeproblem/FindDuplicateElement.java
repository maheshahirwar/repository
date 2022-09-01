package leetcodeproblem;

public class FindDuplicateElement {

	public static void main(String[] args) {
		int[]a= {1,3,4,2,2};
	int nu=	findDuplicate(a);
	System.out.println(nu);
	}
	  public static int findDuplicate(int[] nums) {
	        int n=nums.length;
	       boolean[]vis=new boolean[n];
	        for(int i=0; i<n; i++){
	           if(!vis[nums[i]]){
	            vis[nums[i]]=true;
	           }else{
	               return nums[i];
	               }
	        }
	        return 0;
	    }
}
