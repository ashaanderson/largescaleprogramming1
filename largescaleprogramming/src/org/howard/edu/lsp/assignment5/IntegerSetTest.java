package org.howard.edu.lsp.assignment5;



import org.howard.edu.assignment5.IntegerSetException;

import org.howard.edu.assignment5.IntegerSet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	
	@After
	public void tearDown() {}
	
	@Test
	@DisplayName("Test case for empty")
	public void empty() {
		IntegerSet set1 = new IntegerSet();
		assertTrue(set1.setEmpty());
		set1.add(50);
	    assertFalse(set1.setEmpty());
	    set1.clear();
	    assertTrue(set1.setEmpty());
	       }
	
	@Test
	@DisplayName("Test case for clear()")
	public void Clear()
	{
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(5);
		set1.add(6);
		set1.clear();
		
		assertTrue(set1.setEmpty());
	}
	
	@Test
	@DisplayName("Test case for remove()")
	public void remove()
	{
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(4);
		set1.add(71);
		set1.add(66);
		set1.remove(1);
        boolean ans = true;
		
		if (set1.contains(1))
		{
			 ans = false;
		}
		else
		{
			ans = true;
		}
		assertTrue(ans);
	}
	
	@Test
	@DisplayName("Test case for add()")
	public void add()
	{
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(65);
		set1.add(21);
		boolean ans = false;
		if (set1.contains(1) && set1.contains(2) && set1.contains(65) && set1.contains(21))
		{
			ans = true;
		}
		assertTrue(ans);
	}
	
	@Test
	@DisplayName("Test cases for Length")
	void length() {
		IntegerSet set1 = new IntegerSet();
		assertTrue(0==set1.length());
		set1.add(10);
		assertTrue(1==set1.length());
		set1.add(20);
		assertTrue(2==set1.length());
	}
	@Test
	@DisplayName("Test case for equals()")
	public void equals(){
		IntegerSet set1 = new IntegerSet();
		set1.add(7);
		set1.add(25);
		set1.add(2);
		IntegerSet set2 = new IntegerSet();
		set2.add(7);
		set2.add(25);
		set2.add(2);
		
		
		
		boolean value = set1.equals(set2);
		assertEquals(true, value);
		set1.add(4);
		value = set1.equals(set2);
		assertEquals(false, value);
		
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		assertTrue(set3.equals(set4));
		//Test for one of two sets are empty
		set4.add(4);
		assertFalse(set3.equals(set4));
		assertFalse(set1.equals(set2));
		
		
		
}
	@Test
	@DisplayName("Test case for largest")
	public void Largest() throws IntegerSetException {
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		assertEquals(3, set1.largest());
		assertFalse(set1.largest() == 2);

		assertFalse(set1.largest() == 2);
		assertTrue(set1.largest() == 3);
		assertFalse(set1.largest() == 1);
	}
	@Test
	@DisplayName("Test cases for largest throws exception")
	public void largestexception() {
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			set1.largest();
		});
		String expectedMessage = "list is empty";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(0);
		set1.add(27);
		set1.add(73);
		set1.smallest();
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.smallest();
		
		//test if 1 is the smallest in an integer set in which 1 is the smallest 
		assertEquals(0, set1.smallest());
		//test if 3 is the smallest in an integer set in which 1 is the smallest 
		assertFalse(set1.smallest() == 5);
		assertTrue(set2.smallest() == 3);
		try {
			// testing smallest when the smallest integer is a positive integer.
			assertEquals(0, set1.smallest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
	
	}
	@Test
	@DisplayName("Test cases for smallest throws exception")
	public void smallExcept() {
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			set1.smallest();
		});
		String expectedMessage = "list is empty";
		String actualMessage = exception.getMessage();
		//test that the integer set is empty
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("Test case for contains()")
	public void contains()
	{
		IntegerSet set1 = new IntegerSet();
		set1.add(0);
		set1.add(27);
		set1.add(73);
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);


				
			assertFalse(set1.contains(564));
			assertTrue(set2.contains(4));
			set1.clear();
			boolean value2 = set1.contains(1);
			assertEquals(false, value2);
			
	}
	
	@Test
	@DisplayName("Test case for union")
	public void Union() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();


		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		
		set2.add(4);
		set2.add(8);
		set2.add(12);
		set2.add(16);
		
		set1.union(set2);
		assertEquals("2 4 6 8 12 16 ", set1.toString());
		assertNotEquals("16 12 8 6 4", set1.toString());
	}
	@Test
	@DisplayName("Test cases for intersect")
	public void Intersect() {
		
		IntegerSet set1 = new IntegerSet();
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		
    	
    	set1.intersect(set2);
    	

    	assertEquals("2 4 6 ", set1.toString());
		assertTrue(set1.contains(2));
		assertTrue(set1.contains(6));
		assertFalse(set2.contains(8));
	}
	
	@Test
	@DisplayName("Test cases for difference")
	public void Difference() throws IntegerSetException{
		IntegerSet set1 = new IntegerSet();
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);


		set1.diff(set2);
		//Test that the integers 1, and 4 are not shared between the sets
		assertEquals("8 ", set1.toString());
		//test that 2, and 3 WERE the only shared integers between set1 and set2
		assertFalse(set1.contains(1));
		assertFalse(set1.contains(3));
	}
	
	@Test
	@DisplayName("Test case for toString()")
	public void isToString()
	{
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);

		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);

		 assertEquals("1 2 3 4 ", set1.toString());
		 assertEquals("2 3 4 5 " , set2.toString());
		 
	}
}


