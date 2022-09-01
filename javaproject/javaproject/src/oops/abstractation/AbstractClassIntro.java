package oops.abstractation;

public class AbstractClassIntro {

	 public static void repairCar(Car car) {
		 System.out.println("Car is repairing");
	 }
	
	public static void main(String[] args) {
	 WagonR w = new WagonR();
	 Audi a = new Audi();
	 repairCar(w);
	 repairCar(a);
	 
	}

}
