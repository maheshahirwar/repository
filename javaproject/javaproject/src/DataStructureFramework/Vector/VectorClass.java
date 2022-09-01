package DataStructureFramework.Vector;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<>();
		v.add(34);
		v.add(25);
		v.add(54);
		v.addElement(65);
		v.addElement(76);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.remove(4));
		System.out.println(v);
		Vector vector = new Vector();
		vector.addElement(new String("Hello"));
		vector.addElement(new String("dear"));
		vector.addElement(new String("Everyone"));
		vector.addElement(new Integer(32));
		vector.addElement(new Float(32.54));
		vector.addElement(new Double(45.6589));
		System.out.println(vector);
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.remove(3));
		System.out.println(vector);
	}

}
