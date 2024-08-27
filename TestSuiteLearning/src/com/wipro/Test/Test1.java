package com.wipro.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.develop.Develop1;

public class Test1 {
	Develop1 develop1;
	@Before
	public void setUp() throws Exception {
		develop1=new Develop1();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("sumanth",develop1.develop1("sumanth"));
	}

}
