import java.util.*;

public class Demo {

    
     
	public static void main(String[] args) {
	int[]a= {4,3,7,6,1,2,5};
	Arrays.sort(a);
	for(int i=1;i<a.length;i++) {
		if(a[i-1]!=i) {
			System.out.println(i+1);
			break;
		}
	}
	}

}
