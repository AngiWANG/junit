package com.allinpay.junit.sample.test;

import org.junit.Assert;
import org.junit.Test;

import com.allinpay.junit.sample.Money;

public class TestSample {

	@Test
	public void testAdd() {
		Money money1 = new Money(2, "test");
		Money money2 = new Money(3, "test");
		Assert.assertEquals(5, money1.add(money2).getValue());
		// assertTrue(true);
	}

}
