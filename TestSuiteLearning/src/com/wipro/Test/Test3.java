package com.wipro.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.develop.Develop3;

public class Test3 {
	Develop3 develop3;
	@Before
	public void setUp() throws Exception {
		develop3=new Develop3();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("develop3",develop3.develop3());
	}

}
