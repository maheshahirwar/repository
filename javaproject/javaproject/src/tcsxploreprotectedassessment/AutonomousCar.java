package tcsxploreprotectedassessment;

import java.util.Scanner;

public class AutonomousCar {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		AutonomousCars[]arr=new AutonomousCars[4];
		for(int i=0;i<4;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String brand=sc.nextLine();
			int noOfTestConduct=sc.nextInt();
			int noOfTestPassed=sc.nextInt();
			sc.nextLine();
			String environment=sc.nextLine();
			arr[i]=new AutonomousCars(id,brand,noOfTestConduct,noOfTestPassed,environment);
		}
		String env=sc.nextLine();
		String brd=sc.nextLine();
		int totalTest=findTestPassedByEnv(arr,env);
		if(totalTest==0) {
			System.out.println("There are no tests passed in this particular environment.");
		}else {
			System.out.println(totalTest);
		}
		AutonomousCars a=updateCarGrade(arr,brd);
      if(a==null) {
    	  System.out.println("No Car is available with the specified brand");
      }else {
    	  System.out.println(a.getBrand()+"::"+a.getGrade());
      }
	}
static int findTestPassedByEnv(AutonomousCars[] arr,String evn) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i].getEnvironment().equalsIgnoreCase(evn)) {
			sum+=arr[i].getNoOfTestPassed();
		}
	}
	return sum;
}
static AutonomousCars updateCarGrade(AutonomousCars[]arr,String brd) {
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i].getBrand().equalsIgnoreCase(brd)) {
			int rating=(arr[i].getNoOfTestPassed()*100)/arr[i].getNoOfTestConduct();
			if(rating>=80) {
				arr[i].setGrade("A1");
			}else {
				arr[i].setGrade("B2");
			}
			return arr[i];
		}
	}
	return null;
}

}
class AutonomousCars{
	private int carId;
	private String brand;
	private int noOfTestConduct;
	private int noOfTestPassed;
	private String environment;
	private String grade;
	public AutonomousCars(int carId,String brand,int noOfTestConduct,int noOfTestPassed,String environment) {
		this.carId=carId;
		this.brand=brand;
		this.noOfTestConduct=noOfTestConduct;
		this.noOfTestPassed=noOfTestPassed;
        this.environment=environment;
	}
	public int getCarId() {
		return carId;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getNoOfTestConduct() {
		return noOfTestConduct;
	}
	
	public int getNoOfTestPassed() {
		return noOfTestPassed;
	}
	
	public String getEnvironment() {
		return environment;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}