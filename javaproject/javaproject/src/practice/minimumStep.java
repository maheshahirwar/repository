package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minimumStep {

	static int minJumps(int []arr) {
		int n=arr.length;
		if(n <= 1) return 0;
		if(arr[0] == 0) return -1;
		int max = arr[0];
		int step = arr[0];
		int jump = 1;
		for(int i=1; i < n;++i){
		if(i == n - 1) return jump;
		if(i+arr[i] > max)
		max = i + arr[i];
		step--;
		if(step == 0){
		jump++;
		step = max - i;
		if(step == 0) return -1;
		}
		}
		return jump;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int n=Integer.parseInt(s);
		int []a=new int[n];
		String sr=br.readLine();
		String[]sr1=sr.trim().split(" ");
		for(int i=0; i<n;i++) {
			a[i]=Integer.parseInt(sr1[i]);
		}
		System.out.println(minJumps(a));
	}
	}
