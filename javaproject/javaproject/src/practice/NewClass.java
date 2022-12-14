package practice;
		import java.util.*;
		import java.io.*;
		
public class NewClass{		
		    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		    public static void main (String[] args) throws Exception
			{
			    int T = Integer.parseInt(bf.readLine().trim());
			    for(int t=0; t<T; t++)
			    {
			        int N = Integer.parseInt(bf.readLine().trim());
			        String str[] = bf.readLine().split(" ");
			        
			        int arr[] = new int[N];
			        for(int i=0; i<N; i++)
			        {
			            arr[i] = Integer.parseInt(str[i]);
		            }
		            
		            int ans = MSBS(arr);
		            System.out.println(ans);
			    }
			}
			
			static int MSBS(int arr[])
			{
			    int n = arr.length;
			     
			    int dp1[] = new int[n];
			    int dp2[] = new int[n];
			    for(int i=0; i<n; i++)
			    {
			        dp1[i] = arr[i];
			        dp2[i] = arr[i];
			    }
			    
			    for(int i=0; i<n; i++)
			    {
			        for(int j=0; j<i; j++)
			        {
			            if(arr[i]>arr[j])
			                dp1[i] = Math.max(arr[i] + dp1[j], dp1[i]);
			        }
			    }
			   
			    for(int i=n-2; i>=0; i--)
			    {
			        for(int j=n-1; j>i; j--)
			        {
			            if(arr[i]>arr[j])
			                dp2[i] = Math.max(arr[i] + dp2[j], dp2[i]);
			        }
			    }
			    
			    int res[] = new int[n];
			    for(int i=0; i<n; i++)
			    {
			        res[i] = dp1[i]+dp2[i]-arr[i];
			    }
			    Arrays.sort(res);
			   
			    return res[n-1];
			}
		

	}


