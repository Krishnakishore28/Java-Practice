package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {
	String s1="hii",s2="sumanth";
	DailyTasks tasks;
	@Before
	public void setUp() throws Exception {
		tasks=new DailyTasks();
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("hii sumanth",tasks.doStringConcat(s1,s2));
	}

}
