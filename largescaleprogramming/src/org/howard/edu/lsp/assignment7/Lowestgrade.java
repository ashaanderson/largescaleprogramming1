package org.howard.edu.lsp.assignment7;

import java.util.*;

import org.howard.edu.lsp.assignment7.Strategy.AverageStrategy;





public class Lowestgrade implements AverageStrategy {
  /**
    * This method calculates the curved average by dropping the 
    * two lowest grades
    * @param grades This is the list of grades taken as input
    * @return int  returns the calculated curved average
    */
  public int compute(List<Integer> grades) throws EmptyListException{
    if (grades.size() < 3){
      throw new EmptyListException("List is Empty!");
    }
    int gradesSum = 0;
    grades.remove(grades.indexOf(Collections.min(grades)));
    grades.remove(grades.indexOf(Collections.min(grades)));
    for (int i = 0; i < grades.size(); i++){
      gradesSum += grades.get(i);
    }
    return (int)(gradesSum/grades.size());
  }
}
