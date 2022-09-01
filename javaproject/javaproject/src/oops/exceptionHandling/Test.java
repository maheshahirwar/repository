package oops.exceptionHandling;

public class Test {

	public static void main(String[] args) {
	 try {
		int [] a = new int[5];
	   System.out.println(a[6]);
	 }catch(ArithmeticException e) {
		System.out.println(e.getMessage()+" occured");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage()+" occured");
	} finally {
		System.out.println("Sorry for the inconvience");
	}
	
	}

}
