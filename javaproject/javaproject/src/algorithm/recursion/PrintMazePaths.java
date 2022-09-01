package algorithm.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintMazePaths {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		printMazePaths(0,0,n-1,m-1,"");//first
//		ArrayList<String>ans=printMazePaths(1,1,n,m);//second
//		System.out.println(ans);
	}
//static ArrayList<String> printMazePaths(int sr,int sc,int dr,int dc){
//	if(sr==dr&&sc==dc) {
//		ArrayList<String>an=new ArrayList<>();
//		an.add("");
//		return an;
//	}
//	ArrayList<String>aa=new ArrayList<>();
//	for(int m=1;m<=dr-sr;m++) {
//		ArrayList<String>ans=printMazePaths(sr+m,sc,dr,dc);
//		for(String as:ans) {
//			aa.add(as+"v"+m);
//		}
//	}
//	for(int m=1;m<=dc-sc;m++) {
//		ArrayList<String>ans=printMazePaths(sr,sc+m,dr,dc);
//		for(String as:ans) {
//			aa.add(as+"h"+m);
//		}
//	}
//	
//	for(int m=1;m<=dc-sc&&m<=dr-sr;m++) {
//		ArrayList<String>ans=printMazePaths(sr+m,sc+m,dr,dc);
//		for(String as:ans) {
//			aa.add(as+"d"+m);
//		}
//	}
//	return aa;
//}
static void printMazePaths(int sr,int sc,int dr,int dc,String psf) {
	if(sr==dr&&sc==dc) {
		System.out.println(psf);
		return;
	}
	for(int m=1;m<=dc-sc;m++) {
		printMazePaths(sr,sc+m,dr,dc,psf+"h"+m);
	}
	for(int m=1;m<=dr-sr;m++) {
		printMazePaths(sr+m,sc,dr,dc,psf+"v"+m);
	}
	for(int m=1;m<=dc-sc&&m<=dr-sr;m++) {
		printMazePaths(sr+m,sc+m,dr,dc,psf+"d"+m);
	}
}
}
