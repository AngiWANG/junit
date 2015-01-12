package com.allinpay.junit.sample.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestSample.class, TestEvery.class, TestOnce.class, TestParameter.class })
public class TestSuite {

}
