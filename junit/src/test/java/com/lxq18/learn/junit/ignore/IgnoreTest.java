package com.lxq18.learn.junit.ignore;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {
    @Test(timeout = 200)
    @Ignore("无需处理异常")
    public void testTimeout() throws InterruptedException {
        Thread.sleep(230);
    }
}
