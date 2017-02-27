package com.codeclan.example.stringsplit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/02/2017.
 */

public class TestStringSplitter {

    StringSplitter stringSplitter;

    @Before
    public void before() {
        stringSplitter = new StringSplitter("Well where did that go now");
    }

    @Test
    public void testCountString() {
        assertEquals(6, stringSplitter.countString());
    }
}