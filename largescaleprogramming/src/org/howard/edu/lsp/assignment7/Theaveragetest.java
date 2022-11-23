package org.howard.edu.lsp.assignment7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

public class Theaveragetest {

	  @Test
	  public void testModifiedCompute() throws EmptyListException{

	    List<Integer> listNumbers = new ArrayList<>();
	    listNumbers.add(1);
	    listNumbers.add(2);
	    listNumbers.add(3);
	    listNumbers.add(4);
	    listNumbers.add(5);
	    listNumbers.add(6);
	    Theaverage ctx = new Theaverage();
	    ctx.setAverageStrategy(new Lowestgrade());
	    assertEquals(4, ctx.computeAverage(listNumbers));

	    List<Integer> listNumbers2 = new ArrayList<>();
	    listNumbers2.add(10);
	    listNumbers2.add(24);
	    listNumbers2.add(37);
	    listNumbers2.add(49);
	    listNumbers2.add(53);
	    listNumbers2.add(69);
	    assertEquals(52, ctx.computeAverage(listNumbers2));

	    List<Integer> listNumbers3 = new ArrayList<>();
	    listNumbers3.add(87);
	    listNumbers3.add(92);
	    listNumbers3.add(14);
	    listNumbers3.add(79);
	    listNumbers3.add(55);
	    assertEquals(86, ctx.computeAverage(listNumbers3));
	  }

	  private void assertEquals(int i, int computeAverage) {
		// TODO Auto-generated method stub
		
	}

	@Test
	  public void testNormalCompute() throws EmptyListException {
	    List<Integer> listNumbers = new ArrayList<>();
	    listNumbers.add(1);
	    listNumbers.add(2);
	    listNumbers.add(3);
	    listNumbers.add(4);
	    listNumbers.add(5);
	    listNumbers.add(6);
	    Theaverage ctx = new Theaverage();
	    ctx.setAverageStrategy(new averagegrade());
	    assertEquals(3, ctx.computeAverage(listNumbers));

	    List<Integer> listNumbers2 = new ArrayList<>();
	    listNumbers2.add(10);
	    listNumbers2.add(24);
	    listNumbers2.add(37);
	    listNumbers2.add(49);
	    listNumbers2.add(53);
	    listNumbers2.add(69);
	    assertEquals(40, ctx.computeAverage(listNumbers2));

	    List<Integer> listNumbers3 = new ArrayList<>();
	    listNumbers3.add(44);
	    listNumbers3.add(63);
	    listNumbers3.add(146);
	    listNumbers3.add(729);
	    listNumbers3.add(55);
	    assertEquals(207, ctx.computeAverage(listNumbers3));
	  }

	
	  
	  
	  @Test
		@DisplayName("Test cases for when both strategies (TotalAverageStrategy & DroppedAverageStrategy) throw an EmptyListException")
		public void testEmptyListException() {
			Theaverage average = new Theaverage();
			List<Integer> gradeset = new ArrayList<Integer>();
			
			average.setAverageStrategy(new averagegrade());
			EmptyListException exception = assertThrows(EmptyListException.class, () -> {
				System.out.println(average.computeAverage(gradeset));
				});
			String expectedMessage = "List is Empty!";
			String actualMessage = exception.getMessage();
			assertTrue(actualMessage.contains(expectedMessage));
			
			
			List<Integer> gradeset2 = new ArrayList<Integer>();
			
			average.setAverageStrategy(new Lowestgrade());
			EmptyListException exception2 = assertThrows(EmptyListException.class, () -> {
				System.out.println(average.computeAverage(gradeset2));
				});
			
			String expectedMessage2 = "List is Empty!";
			String actualMessage2 = exception2.getMessage();
			assertTrue(actualMessage2.contains(expectedMessage2));
			
		}

	  
}
