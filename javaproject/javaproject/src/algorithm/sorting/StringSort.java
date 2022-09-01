package algorithm.sorting;

public class StringSort {

	public static void main(String[] args) {
		String[]s= {"mahesh","rahul","deepak","makhan","muskan","vinod"};
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s.length-1-i; j++) {
				if(s[j].compareTo(s[j+1])>0) {
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(String a:s) {
			System.out.print(a+" ");
		}
		

	}

}
