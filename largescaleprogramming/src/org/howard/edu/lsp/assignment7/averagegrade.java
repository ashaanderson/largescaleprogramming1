package org.howard.edu.lsp.assignment7;

import java.util.*;


import org.howard.edu.lsp.assignment7.Strategy.AverageStrategy;


/**
@author Asha Anderson


*/
public class averagegrade implements AverageStrategy {
	/**
	    * This method calculates the average of the grades in list
	    * @param  list of grades taken as input
	    * @return int This returns the calculated grade average
	    */
    
  public int compute(List<Integer> grades) throws EmptyListException{
    if (grades.size() == 0){
      throw new EmptyListException();
    }
    int gradesSum = 0;
    for (int i = 0; i < grades.size(); i++){
      gradesSum += grades.get(i);
    }
    return (int)(gradesSum/grades.size());
  }
}
