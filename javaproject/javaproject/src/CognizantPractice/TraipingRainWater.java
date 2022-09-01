package CognizantPractice;

public class TraipingRainWater {

	public static void main(String[] args) {
		int[]a={3,0,0,2,0,4};
        System.out.println(solve(a));
	}
static int solve(int[]a) {
	int n=a.length;
	int left=0,right=0;
    int i=0;
    int j=n-1;
    int ans=0;
    while(i<j) {
    	if(a[i]<a[j]) {
    		if(a[i]>left) {
    			left=a[i];
    		}else {
    			ans+=left-a[i];
    		}
    		i++;
    	}else {
    		if(a[j]>right) {
    			right=a[j];
    		}else {
    			ans+=right-a[j];
    		}
    		j--;
    	}
    }
    return  ans;
}
}
