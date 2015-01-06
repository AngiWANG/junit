package com.angi.junit;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOnce {
	@BeforeClass
	public static void setUp() {
	}

	@Test
	public void testAdd() {
		assertTrue(true);
	}

	@AfterClass
	public static void TearDown() {
	}

}
