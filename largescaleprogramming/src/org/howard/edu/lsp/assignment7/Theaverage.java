package org.howard.edu.lsp.assignment7;

import java.util.*;

import org.howard.edu.lsp.assignment7.Strategy.AverageStrategy;





/**
* <h1>Average!</h1>
* <p>The Average  class implements the Strategy pattern
* functionality, it enables the program decide what average 
* computation it uses.
* </p>

*/
public class Theaverage {
	  private AverageStrategy strategy;
	  /**
	    * This method sets the average strategy to use
	    * @param AverageStrategy This is the average strategy that's selected
	    * @return None
	    */
	  public void setAverageStrategy(AverageStrategy strategy){
	    this.strategy = strategy;
	  }
	  
	  /**
	    * This method computes the average using the selected strategy
	    * @param grades This is a list of grades
	    * @return int This returns the desired average
	    */
	  public int computeAverage(List<Integer> grades) throws EmptyListException{
	    return strategy.compute(grades);
	  }
	}
