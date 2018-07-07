package com.lxq18.learn.junit.suite;

import com.lxq18.learn.junit.parameterized.Parameterized2Test;
import com.lxq18.learn.junit.parameterized.ParameterizedTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ParameterizedTest.class,
        Parameterized2Test.class})
public class SuiteTest {
    @Test
    public void testSuite() {
        System.out.println("success");
    }
}
