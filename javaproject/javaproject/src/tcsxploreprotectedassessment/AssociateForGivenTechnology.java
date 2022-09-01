package tcsxploreprotectedassessment;
import java.util.*;
public class AssociateForGivenTechnology {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		Associate[]arr=new Associate[5];
	for(int i=0;i<5;i++) {
		int id=sc.nextInt();
		String name=sc.next();
		String technology=sc.next();
		int experience=sc.nextInt();
		arr[i]=new Associate(id,name,technology,experience);
	}
   String searchTechnology=sc.next();
   sc.close();
   Associate[]a=associatesForGivenTechnology(arr,searchTechnology);
   
    for(int i=0;i<a.length;i++) {
    	System.out.println(a[i].getId());
    }
	}
static Associate[] associatesForGivenTechnology(Associate[]arr,String searchTechnology) {
 Associate []a=new Associate[0];
	for(int i=0;i<arr.length;i++) {
	 if(arr[i].getTechnology().equals(searchTechnology)&&arr[i].getExperienceInYear()%5==0){
		a=Arrays.copyOf(a, a.length+1);
		a[a.length-1]=arr[i];
	 }
 }
	return a;
}
}
class Associate{
	int id;
	String name;
	String technology;
	int experienceInYear;
	public Associate(int id,String name,String technology,int experienceInYear) {
		this.id=id;
		this.name=name;
		this.technology=technology;
		this.experienceInYear=experienceInYear;
	}
	
	public int getId() {
		return id;
	}
   public String getName() {
		return name;
	}
	public String getTechnology() {
		return technology;
	}
	public int getExperienceInYear() {
		return experienceInYear;
	}
	
}