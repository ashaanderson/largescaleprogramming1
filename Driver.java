package org.howard.edu.lsp.assignment2;

//large scale programming
//Asha Anderson
//02973602

public class Driver {
	public static void main(String[] args) {
		Solution comb = new Solution();
		
		
		System.out.println(comb.compute(new int[]{1,2,3,4,5,6},8));
		System.out.println(comb.compute(new int[]{5,5,15,10}, 15));
		System.out.println(comb.compute(new int[]{1,2,3,4,5}, 16));
		System.out.println(comb.compute(new int[]{2,10,6,8,5}, 10));


  	}
}