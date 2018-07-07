package com.lxq18.learn.junit.exception;

import org.junit.Test;

public class ExceptionTest {
    @Test(expected = EnergyNotEnoughException.class)
    public void testException() {
        throw new EnergyNotEnoughException();
    }
}
