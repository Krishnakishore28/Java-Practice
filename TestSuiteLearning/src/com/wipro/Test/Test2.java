package com.wipro.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.develop.Develop2;

public class Test2 {
	Develop2 develop2;
	@Before
	public void setUp() throws Exception {
		develop2=new Develop2();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("develop2",develop2.develop2());
	}

}
