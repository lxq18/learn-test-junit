package com.lxq18.learn.junit.timeout;

import org.junit.Test;

public class TimeoutTest {
    @Test(timeout = 200)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(190);
    }
}
