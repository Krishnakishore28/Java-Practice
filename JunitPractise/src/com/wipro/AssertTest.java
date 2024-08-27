package com.wipro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertTest {
	int[] arrAscending;
	@Before
	public void setUp() throws Exception {
		arrAscending=new int[]{1,2,3,4,5};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void asserttest() {
		//fail("Not yet implemented");
		//assertEquals(1, Assert.compute());
		assertFalse(Assert.isTrue());
	}
	@Test
	public void assertIntTest() {
		assertEquals(1,Assert.compute());
	}
	@Test
	public void assertArrayTest() {
		
		assertArrayEquals(arrAscending, Assert.Array());
	}
	
	

}
