package oops.generic;

public class Generics {

	public static void main(String[] args) {
		Pair<String,Integer>p1=new Pair("Mahesh",435);
		Pair<Boolean, String>p2=new Pair(true,"Hello");
		p1.getDescription();
		p2.getDescription();
	}

}
