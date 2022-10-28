package org.howard.edu.lsp.midterm.problem2;

public class Problem2test {
	public static void main(String[] args) {
		Person p1 = new Person("Carly", "1233", 21);
		Person p2 = new Person("Jim", "1233", 25);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		
		if (p1.equals(p2)) {
		    System.out.println("These are the same people!");
		} else {
		    System.out.println("These are not the same people!");
		}
		
	}
}