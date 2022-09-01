package algorithm.recursion;

public class CountString2DCharacterArray {

public static int searchString(String search,int row,int col, String[]str, int row_max,int col_max) {
	int found=0;
	
	int r,c;
	for(r=0;r<row_max;++r) {
		for(c=0;c<col_max;++c) {
			found+=internalSearch(search,r,c,str,row_max-1,col_max-1,0);
		}
	}
	return found;
}
	
public  static int internalSearch(String search,int r,int c,String[]str,int row_max,int col_max,int val) {
	int found=0;
	  if(r>=0&&r<=row_max&&c>=0&&c<=col_max&&val<search.length()&&search.charAt(val)==str[r].charAt(c)) {
		  char match=search.charAt(val);
		  val+=1;
		  str[r]=str[r].substring(0, c)+"0"+str[r].substring(c+1);
		  if(val==search.length()) {
			  found=1;
		  }else {
			  found+=internalSearch(search,r,c+1,str,row_max,col_max,val);
			  found+=internalSearch(search,r,c-1,str,row_max,col_max,val);
			  found+=internalSearch(search,r+1,c,str,row_max,col_max,val);
			  found+=internalSearch(search,r-1,c,str,row_max,col_max,val);
		  }
		  str[r]=str[r].substring(0, c)+match+str[r].substring(c+1);
	  }
	return found;
}
	public static void main(String[] args) {
//		char[][]ar= {{'B','B','A','B','B','M'},
//				     {'C','B','M','B','B','A'},
//				     {'I','B','A','B','B','G'},
//				     {'G','O','Z','B','B','I'},
//				     {'A','B','B','B','B','C'},
//				     {'M','C','I','G','A','A'}};
		String search="MAGIC";
		String input[]= {"BBABBM","CBMBBA","IBABBG",
				          "GOZBBI","ABBBBC","MCIGAM"};
    String[]str=new String[input.length];
    int i;
    for(i=0;i<input.length; ++i) {
    str[i]=input[i];
    }
    System.out.println(searchString(search,0,0,str,str.length,str[0].length()));
	}

}
