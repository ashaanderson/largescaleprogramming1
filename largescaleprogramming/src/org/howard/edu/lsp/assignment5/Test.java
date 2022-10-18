package org.howard.edu.lsp.assignment5.test;


import org.howard.edu.assignment5.IntegerSet;
import org.howard.edu.assignment5.IntegerSetException;

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
		System.out.println("Is set1 equal to set2?: " + set1.equals(set2));
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Value of Set2 is:" + set2.toString());
		

		System.out.println("Largest element in set1 : "+set1.largest());

		System.out.println("Smallest element in set2 : "+set2.smallest());

		System.out.println("Difference of Set1 and Set2");
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Value of Set2 is:" + set2.toString());

		set2.diff(set1);	// difference of set1 and set2
		System.out.println("Result of difference of Set1 and Set2");
		System.out.println(set2.toString());

        
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.union(set2);	// union of set1 and set2
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

		IntegerSet seti= set1.intersect(set2);

		System.out.println("The two sets Intersection looks like this: "+seti.returnSet() );
		
		 System.out.println("Set 1 != Set2: equals: " + set1.equals( set2 ) );
		 System.out.println("Set 2 != Set1: equals: " + set2.equals( set1 ) );
		  set2.add( 0 );
		 System.out.println("Set 1 == Set 2: equals: " + set1.equals( set2 ) );
		 set1.remove( 0 );
		 System.out.println("Check if sets are empty"); //checking if sets are empty
			System.out.println("length of set1 is " + set1.length() + ", Set1: " + set1.toString());
			System.out.println("Is set1 empty?: " + set1.setEmpty());
			
			System.out.println("length of set2 is " + set2.length() + ", Set2: " + set2.toString());
			System.out.println("Is set2 empty?: " + set2.setEmpty());
			
			System.out.println("---------");
			set1.clear();
			System.out.println("Set1 has been cleared. The length of set1 is " + set1.length());
			System.out.println("Is set1 empty?: " + set1.setEmpty());
		set1.clear();
		System.out.println("Set1 has been cleared. The length of set1 is " + set1.length());
		System.out.println("Is it true set1 is empty?: " + set1.setEmpty());
			
		


		}

		


}
