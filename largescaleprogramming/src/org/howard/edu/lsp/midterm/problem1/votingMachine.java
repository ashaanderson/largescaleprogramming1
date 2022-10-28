package org.howard.edu.lsp.midterm.problem1;

import java.util.List;

import java.util.ArrayList;

public class votingMachine {
	
	private List<String> canidates = new ArrayList<String>();
	private List<Integer> total_Votes = new ArrayList<Integer>();
	public int numofVotes = 0;
	
	/**
	 * Function adds canidates to the list and starts the votes at index 1
	 * @param name of canadiate in a string
	 */
	public void addCandidate(String name) {
		boolean added = canidates.contains(name);
		if (added) {
			System.out.println("candidate is already listed");
		}
		else {	canidates.add(name);
		total_Votes.add(0);
		}
	} 
	
	

	/**
	 * // Cast certain number of votes to the candidate with the given name
	 * @param name string of voting canidates
	 * @param number of votes per canidate
	 */
	public void castVotes(String name, int votes) {
		int i;
		i = canidates.indexOf(name);
		total_Votes.set(i, votes);
			numofVotes += votes;
		}
	

	/**
	 * // Return the number of votes that each canidate recieved 
	 * @throws UnknownCandidateException if name not present
	 * @param canidates name in string
	 * @return an integer of how many votes each canidate recieved
	 */
	public int getVotes(String names)  {
		if (canidates.indexOf(names) == -1) {
			throw new ArrayIndexOutOfBoundsException("UnknownCandidateException; candidate is not listed");
		}
		int i = canidates.indexOf(names);
		int votes = total_Votes.get(i);
		return votes;
		
	}

	/**
	 * // returns the total number of votes for all canidates
	 * @return total votes of all canidates in list
	 */
	public int sum() {
		return numofVotes;
	}
}

