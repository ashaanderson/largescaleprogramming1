package org.howard.edu.lsp.assignment4.test;


import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;

public class Test {
	public static void main(String[] args) throws IntegerSetException {

		// make 2 instance of integerset class for implementation
		IntegerSet set1= new IntegerSet();
		IntegerSet set2= new IntegerSet();

		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(3);
		set1.add(8);
		set1.add(7);

		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);

		System.out.println("Set 1 : "+set1.returnSet());
		System.out.println("Set 2 : "+set2.returnSet());

		System.out.println("Is equal : "+set1.equals(set2));

		System.out.println("Largest element in set1 : "+set1.largest());

		System.out.println("Smallest element in set2 : "+set2.smallest());

		IntegerSet setu= set1.union(set2);

		System.out.println("The Union of the two sets : "+setu.returnSet() );

		IntegerSet seti= set1.intersect(set2);

		System.out.println("The two sets Intersection looks like this: "+seti.returnSet() );



		}

		


}
