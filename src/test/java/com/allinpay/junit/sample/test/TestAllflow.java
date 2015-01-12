package com.allinpay.junit.sample.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAllflow {

	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}

	@Before
	public void before() {
		System.out.println("before");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("test2");
		Assert.assertTrue(true);
	}

}
