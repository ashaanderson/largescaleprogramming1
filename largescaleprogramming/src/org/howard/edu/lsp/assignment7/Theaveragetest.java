package org.howard.edu.lsp.assignment7;

import org.junit.jupiter.api.Test;

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
	  public void testNormalComputeException() throws Exception{
	    List<Integer> listNumbers = new ArrayList<>();
	    Theaverage ctx = new Theaverage();
	    ctx.setAverageStrategy(new averagegrade());
	    ctx.computeAverage(listNumbers);
	  }

	  @Test 
	  public void testModifiedComputeException() throws Exception{
	    List<Integer> listNumbers = new ArrayList<>();
	    listNumbers.add(1);
	    listNumbers.add(2);
	    Theaverage ctx = new Theaverage();
	    ctx.setAverageStrategy(new Lowestgrade());
	    ctx.computeAverage(listNumbers);

	    List<Integer> listNumbers2 = new ArrayList<>();
	    listNumbers2.add(104);
	    ctx.computeAverage(listNumbers2);

	    List<Integer> listNumbers3 = new ArrayList<>();
	    ctx.computeAverage(listNumbers3);
	  }
	  
}
