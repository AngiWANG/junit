package com.angi.junit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Administrator
 * 第一个注意点
 */
@RunWith(Parameterized.class)
public class TestParameter {
	private static Money f12CHF;
	//	第二个注意点
	private Money expected;
	private Money target;

	@BeforeClass
	public static void setUp() {
		f12CHF = new Money(12, "CHF");
	}

	/**
	 *  第三个注意点
	 * @return
	 */
	@Parameters
	public static Collection words() {
		return Arrays.asList(new Object[][] { { new Money(23, "CHF"), new Money(11, "CHF") },
				{ new Money(28, "CHF"), new Money(16, "CHF") }

		});
	}

	/**
	 * 第四个注意点
	*参数化测试必须的构造函数
	*@paramexpected   期望的测试结果，对应参数集中的第一个参数
	*@paramtarget 测试数据，对应参数集中的第二个参数
	*/
	public TestParameter(Money expected, Money target) {
		this.expected = expected;
		this.target = target;
	}

	/**
	  *实际需要测试的方法
	  */
	@Test
	public void add() {
		assertTrue(expected.equals(f12CHF.add(target)));
	}

}
