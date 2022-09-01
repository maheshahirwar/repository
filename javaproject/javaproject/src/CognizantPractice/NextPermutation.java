package CognizantPractice;

public class NextPermutation {

	public static void main(String[] args) {
		String n= "21";
		char[]a=n.toCharArray();
		permutation(a);

	}
static void permutation(char[]a) {
	int len=a.length;

	int i=len-2;
	while(i>=0&&a[i+1]<=a[i]) {
		i--;
	}
	if(i>=0) {
		int j=len-1;
		while(j>=0&&a[i]>=a[j]) {
			j--;
		}
		swap(a,i,j);
	}else {
		System.out.println("-1");
	}
	reverse(a,i+1);
	for(int it:a) {
		System.out.print(Character.getNumericValue(it)+" ");
	}
}
static void reverse(char[]ar, int i) {
	int l=ar.length-1;
	while(i<l) {
		swap(ar,i,l);
		i++;
		l--;
	}
}
static void swap(char[]ar,int a,int b) {
	char temp=ar[a];
	ar[a]=ar[b];
	ar[b]=temp;
}
}
