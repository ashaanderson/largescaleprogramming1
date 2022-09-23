package org.howard.edu.lsp.assignment2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
/**
 * large scale programming
 * Asha Anderson
 * @author ashaanderson
 *
 */


//ATTEMPT 1
/*public class Combinations{

	  public int[] TwoSum(int[]searchArray, int target) {	
			for (int i = 0; i < (searchArray.length); i++) {
				for (int j=i+1; j<searchArray.length; j++ ) {
					if (searchArray[i] + searchArray[j] == target) {
						return new int[]{i, j};
					}
				}
			}
			
			return null;
		}

		public int[] twoSumEnhanced(int[]searchArray, int target) {	
			System.out.println("twoSumEnhanced");
			Map<Integer, Integer> complements = new HashMap<>();
			for (int i=0; i<searchArray.length; i++) {
				Integer complementIndex = complements.get(searchArray[i]);
				if (complementIndex != null ) {
					return new int[] {i, complementIndex};
				}
				
				complements.put(target - searchArray[i], i);
			}
			
			return null;
		}
	}
*/
public class Solution {
	
	

	
	
	
	public ArrayList<ArrayList<Integer>> compute(int[] input, int target) {

		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer, ArrayList<Integer>> index = storeIndex(input);
		Arrays.sort(input);
		output = compute(input, target, 0, new ArrayList<Integer>(),output);
		output=findResult(index,output);
		return output;
	}
	
	
	
	
	public HashMap<Integer, ArrayList<Integer>> storeIndex(int[] input){
		HashMap<Integer, ArrayList<Integer>> indexes = new HashMap<>();
		
		for(int i = 0; i < input.length; i++) {
			if (indexes.get(input[i]) == null) {
				ArrayList<Integer> arr  = new ArrayList<>();
				arr.add(i);
				indexes.put(input[i], arr);
				
				
			} else {
				ArrayList<Integer> new_array  = indexes.get(input[i]);
				new_array.add(i);
				indexes.put(input[i], new_array);
			}
		}
		return indexes;
	}
	
	
	
	public ArrayList<ArrayList<Integer>> compute(int[] input, int target, int index, ArrayList<Integer> current_combination,ArrayList<ArrayList<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<Integer>(current_combination));
			return result;
		}
		
	    for(int i = index; i < input.length; i++){
	        if(target > 0){
	        	current_combination.add(input[i]);
	            compute(input, target - input[i],i+1,current_combination,result);
	            current_combination.remove(current_combination.size()-1);
		    }
		}
	    return result;
	}
	
	
	public ArrayList<ArrayList<Integer>> findResult(HashMap<Integer, ArrayList<Integer>> indexes,ArrayList<ArrayList<Integer>> result) {
		for (int i = 0; i < result.size(); i++){
			for (int j = 0; j < result.get(i).size(); j++) {
				int num = result.get(i).get(j);
				result.get(i).set(j, indexes.get(num).get(0));
				if (indexes.get(num).size() != 1) {
					indexes.get(num).remove(0);
				}
			}
		}
		return result;
	}}