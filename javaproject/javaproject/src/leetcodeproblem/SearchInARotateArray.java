package leetcodeproblem;

public class SearchInARotateArray {

	public static void main(String[] args) {
		int[]a= {4,5,6,7,0,1,2};
       int target=0;
       System.out.println(search(a,target));
	}
static int search(int[]a,int key) {
	if(a==null||a.length==0)return -1;
	int left=0;
	int right=a.length-1;
	while(left<right) {
		int mid=left+(right-left)/2;
		if(a[mid]>a[right]) {
			left=mid+1;
		}else {
			right=mid;
		}
	}
	int start=left;
	left=0;
	right=a.length-1;
	if(key>=a[start]&&key<=a[right]) {
		left=start;
	}else {
		right=start;
	}
	
	while(left<=right) {
		int mid=left+(right-left)/2;
		if(a[mid]==key) {
			return mid;
		}else if(a[mid]<key) {
			left=mid+1;
		}else {
			right=mid-1;
		}
	}
	return -1;
}
}
