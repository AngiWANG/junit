package com.angi.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestSample.class, TestFixture.class, TestOnce.class, TestParameter.class })
public class TestSuite {

}
