package com.allinpay.junit.sample.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.allinpay.junit.sample.Money;

@RunWith(Parameterized.class)
public class TestParameter {
	private static Money f12CHF;

	private Money expected;
	private Money target;

	@BeforeClass
	public static void setUp() {
		f12CHF = new Money(12, "CHF");
	}

	/**
	 * 测试数据构造
	 * 
	 * @return
	 */
	@Parameters
	public static Collection<Object[]> words() {
		return Arrays.asList(new Object[][] { { new Money(23, "CHF"), new Money(11, "CHF") },
				{ new Money(28, "CHF"), new Money(16, "CHF") }

		});
	}

	/**
	 * 参数化测试必须的构造函数
	 * 
	 * @paramexpected 期望的测试结果，对应参数集中的第一个参数
	 * @paramtarget 测试数据，对应参数集中的第二个参数
	 */
	public TestParameter(Money expected, Money target) {
		this.expected = expected;
		this.target = target;
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd");
		assertTrue(expected.getValue() == f12CHF.add(target).getValue());
	}

}
