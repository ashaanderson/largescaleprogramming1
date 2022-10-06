package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList; 

import java.util.Collections;


public class IntegerSet {
	private ArrayList<Integer> set = new ArrayList<Integer>();
	
	public ArrayList<Integer> returnSet() {return set;}

	
	public boolean setEmpty() {
		if (set.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	// Default Constructor
	public IntegerSet() {
	}
	public void clear() {
		set.clear();
		
	};
	public int length() {
		
		return set.size();
	
	}; // returns the length
	
	public boolean equals(IntegerSet b) {
	      
	       ArrayList<Integer> set2=b.returnSet();
	         
	       if(set.size()!=set2.size()) {
	           return false;
	       }
	         
	       ArrayList<Integer> temp1=set;
	         
	       ArrayList<Integer> temp2=set2;
	         
	       Collections.sort(temp1);
	       Collections.sort(temp2);
	         
	       for(int i=0;i<temp1.size();i++) {
	           if(temp1.get(i)!=temp2.get(i)) {
	               return false;
	           }
	       }
	         
	       return true;
	      
	   }
	
	public boolean contains(int item) {
		boolean exist=false;
		for(int i=0;i<set.size();i++) {
	        
	        if(set.get(i)==item) {
	            exist=true;
	        }
	    }
		return exist;}

	
	
	public int largest() throws IntegerSetException {
		if (set.size() == 0) {
			throw new IntegerSetException("list is empty");
		}
		if (set.size() == 0) {
			throw new IntegerSetException("list is empty");
		}
		return Collections.max(set);}
		
		
	
	public int smallest() throws IntegerSetException {
		if (set.size() == 0) {
			throw new IntegerSetException("list is empty");
		}
		if (set.size() == 0) {
			throw new IntegerSetException("list is empty");
		}
		return Collections.min(set);}

	

	
	public IntegerSet union(IntegerSet intSetb) {
		
		ArrayList<Integer> newSet  = intSetb.returnSet();
		for (int i=0; i < newSet.size(); i++) {
			add(newSet.get(i));
		}
		return intSetb;
	       
	        

	}
	
	public void remove(int item)  {
		if (set.size() == 0) {
			throw new IntegerSetException("list is empty");
		}
		
		 for(int i=0;i<set.size();i++) {
	          
	           if(set.get(i)==item) {
	               set.remove(i);
	           }

		 }
		 };

	public void add(int item) {
		
		  if(contains(item)==false) {
	           set.add(item);
	       }
	};

	
	
	public IntegerSet intersect(IntegerSet intSetb) 
	{
		ArrayList<Integer> newSet  = intSetb.returnSet();
		set.retainAll(newSet);
		return intSetb;
	   };

		
		 
	
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> newSet = intSetb.returnSet();
		set.removeAll(newSet);
		
	};
	
	 public String toString() {
		   StringBuilder buffer = new StringBuilder();
		   for (Integer nextNumber : set) {
		       buffer.append(nextNumber).append(" ");
		   }
		   return buffer.toString();}}