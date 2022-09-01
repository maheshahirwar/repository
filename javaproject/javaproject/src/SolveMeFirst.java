import java.util.*;
class SolveMFirst{
 public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String[]s=new String[n];
  for(int i=0;i<n;i++){
      s[i]=sc.next();
  }
  
   String sub=sc.next();
    sub=sub.replace(",","");
   List<String>ans=new ArrayList<>();
   for(int i=0;i<n;i++){
       ans.add(s[i]);
   }
   for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){
           ans.add(s[i]+""+s[j]);
       }
   }
   for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){
           for(int k=j+1;k<n;k++){
               ans.add(s[i]+""+s[j]+""+s[k]);
           }
       }
   }
   System.out.println(ans);
} 
}