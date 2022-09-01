package CognizantPractice;
import java.util.*;
public class SearchingAlgorithmPractice {

	public static void main(String[] args) {
	int[]a= {43,76,89,64,2,2422,12,443,23,55,772,112,56,377,8444,66};
	int search=443;
	Arrays.sort(a);
    //int index= linearSearch(a,search);
    int index= binarySearch(a,search);
    System.out.println(index);
	}
 static int linearSearch(int[]a,int target) {
	 for(int i=0;i<a.length;i++) {
		 if(a[i]==target) {
			 return i;
		 }
	 }
	 return -1;
 }
 static int binarySearch(int []a,int target) {
	 int low=0;
	 int high=a.length-1;
	 while(low<high) {
		 int mid=(low+high)/2;
		 if(a[mid]==target) {
			 return mid;
		 }
		 else if(a[mid]<target){
			 low=mid+1;
		 }else {
			 high=mid;
		 }
		 
	 }
	 return -1;
 }
}
