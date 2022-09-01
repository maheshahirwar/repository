package practice;

public class JackAndJill {

	public static void main(String[] args) {
		int []target= {16,16,16};
       System.out.println(play_the_game(target));
	}
static int play_the_game(int[]target) {
	int n=target.length;
	int result=0;
	while(true) {
		int zero_count=0;
		int i;
		for(i=0; i<n; i++) {
			if(target[i]%2==1)break;
			else if(target[i]==0)zero_count++;
		}
		if(zero_count==n)
			return result;
		if(i==n) {
			for(int j=0; j<n; j++)
				target[j]=target[j]/2;
				result++;
		}
		for(int j=i; j<n; j++) {
			if(target[j]%2==1) {
				target[j]--;
				result++;
			}
		}
	}
}
}
