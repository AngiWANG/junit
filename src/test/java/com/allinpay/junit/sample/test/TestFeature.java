package com.allinpay.junit.sample.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestFeature {

	@Test(expected = IndexOutOfBoundsException.class)
	public void testException() {
		System.out.println("testException");
		new ArrayList<Object>().get(0);
	}

	@Ignore("测试方法会被忽略")
	public void testIgnore() {
		System.out.println("testIgnore");
		Assert.assertTrue(true);
	}

	/**
	 * 超时测试，可以用来测试执行效率和性能<br>
	 * 单位：毫秒
	 * 
	 * @throws InterruptedException
	 */
	@Test(timeout = 1000)
	public void testTimeOut() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("testTimeOut");
		Assert.assertTrue(true);
	}
}
