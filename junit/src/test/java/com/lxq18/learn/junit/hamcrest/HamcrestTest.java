package com.lxq18.learn.junit.hamcrest;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class HamcrestTest {
    private List<String> vals;

    @Before
    public void setUp() throws Exception {
        vals = new ArrayList<>();
        vals.add("a");
        vals.add("b");
        vals.add("c");
    }

    @Test
    public void testWithoutHamcrest() {
        assertTrue(vals.contains("a") || vals.contains("b") || vals.contains("c"));
    }

    @Test
    public void testHamcrest() {
        assertThat(vals, hasItem(anyOf(
                equalTo("a"),
                equalTo("b"),
                equalTo("c")
        )));
    }

}
