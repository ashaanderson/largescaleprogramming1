package org.howard.edu.lsp.assignment7;

import java.util.*;

/**
* <p>
* This is an interface with a function to be implemented in classes.
* </p>
* */
public class Strategy {
	public interface AverageStrategy {
		public int compute(List<Integer> grades) throws EmptyListException;
	}
	

}
