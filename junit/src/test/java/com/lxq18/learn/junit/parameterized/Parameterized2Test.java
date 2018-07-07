package com.lxq18.learn.junit.parameterized;

import com.lxq18.learn.junit.HttpResult;
import com.lxq18.learn.junit.HttpResultUtil;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
@AllArgsConstructor
public class Parameterized2Test {
    private String body;
    private HttpResult httpResult;

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {null, null},
                {null, new HttpResult(400, null)},
                {null, new HttpResult(400, "ab")},
                {null, new HttpResult(200, null)},
                {"abc", new HttpResult(200, "abc")},
        });
    }

    @Test
    public void process200() throws Exception {
        assertEquals(body, HttpResultUtil.process200(httpResult));
    }

}