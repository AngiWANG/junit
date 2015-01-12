package com.allinpay.junit.sample.test;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

public class TestFeature {

	@Test(expected = IndexOutOfBoundsException.class)
	public void testException() {
		System.out.println("testException");
		new ArrayList<Object>().get(0);
	}

	@Ignore("this test method isn't working now")
	public void testIgnore() {
		System.out.println("testIgnore");
		new ArrayList<Object>().get(0);
	}

	@Test(timeout = 1000)
	public void testTimeOut() throws InterruptedException {
		// wait(2000);
		System.out.println("testTimeOut");
	}

}
