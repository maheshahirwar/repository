package DSApractice;


public class QuickSort {
 
public static void main(String[] args) {
int[]a= {23,54,13,56,434,12,466,3,77,3,577,9,978};
quickSortRecursion(a,0,a.length-1);
for(int it:a) {
System.out.print(it+" ");
}
}
static int partition(int[] a,int b,int r) // partition method
{
int pivot=a[r];
int pindex=b-1;
for(int i=b;i<r;i++)
{
if(a[i]<=pivot)
{
pindex++;
int t=a[i];
a[i]=a[pindex];
a[pindex]=t;
}
}
pindex++;
int t=a[pindex];
a[pindex]=a[r];
a[r]=t;
return pindex;
 
}
static void quickSortRecursion(int []a, int low, int high) {
int pi=partition(a, low, high);
if(low<pi-1) {
quickSortRecursion(a,low,pi-1);
}
if(pi<high) {
quickSortRecursion(a, pi, high);
}
}
}