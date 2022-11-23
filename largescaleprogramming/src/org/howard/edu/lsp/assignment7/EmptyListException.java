package org.howard.edu.lsp.assignment7;

public class EmptyListException extends Exception {
	  private static final long serialVersionUID = 1L;

	  /**
	    * This method outputs an error message for the user defined exception
	    * @param  the  error message
	    * @return None
	    */
	  public EmptyListException() {
	    super("List is Empty!");
	  }
	}
