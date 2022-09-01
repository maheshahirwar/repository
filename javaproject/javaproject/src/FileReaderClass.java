import java.io.*;
import java.util.*;
public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		    File file = new File("C:\\Users\\91722\\OneDrive\\Desktop\\hii.txt");
	        BufferedReader br  = new BufferedReader(new FileReader(file));
	        String st;
	        String location_id,vehicle_no,availability,driver_contact_no;
			String vehicle_category;
	        Map<String,String>map=new HashMap<>();
	        Map<String,Details>cap_details=new HashMap<>();
	        while ((st = br.readLine()) != null) {
	        	 location_id=st.substring(0, 3);
	        	 vehicle_no=st.substring(4, 14);
	        	 vehicle_category=st.substring(15, 19);
	        	 availability=st.substring(20, 23);
	        	 driver_contact_no=st.substring(24);
cap_details.put(location_id, new Details(vehicle_no,vehicle_category,availability,
		driver_contact_no));
	        }
	       Scanner sc=new Scanner(System.in);
		  int user_location_id=sc.nextInt(); 
          for(String id:cap_details.keySet()) {
        	  Details d=cap_details.get(id);
        	  if(d.availability.equals("yes"))
        	  {
            	if(map.containsKey(d.vehicle_category)) {
            		String ii=map.get(d.vehicle_category);
            		int distance=Integer.parseInt(id)-user_location_id;
            		int sq=distance*distance;
            		int distance1=Integer.parseInt(ii)-user_location_id;
            		int sq1=distance1*distance1;
            		if(sq<sq1) {
            			map.put(d.vehicle_category, id);
            		}
            	}else {
            		map.put(d.vehicle_category, id);
            	}
        	  }
	      }
          
       ArrayList<String>ans=new ArrayList<>();
       for(String id:map.keySet()) {
    	 String ss="";
    	  String find=map.get(id);
    	  Details d=cap_details.get(find);
    	 ss= find+","+d.vehicle_no+","+d.vehicle_category+","+d.availability+","+d.driver_contact_no;
    	 ans.add(ss);
    	 }
     for(String a:ans) {
    	 System.out.println(a);
     }
	}
}
class Details{
	String vehicle_no,availability,driver_contact_no;
	String vehicle_category;
	Details(String vn,String vc,String ava,String dcn){
		vehicle_no=vn;
		vehicle_category=vc;
		availability=ava;
		driver_contact_no=dcn;
	}
}