package com.stackroute.PE4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryStringTest {
    HarryString h1;

    @Before
    public void setUp() throws Exception {
        h1=new HarryString();
    }

    @After
    public void tearDown() throws Exception {
        h1=null;
    }

    @Test
    public void presenceOfHarry() {
        assertEquals(true,h1.presenceOfHarry("This is Harry "));
    }

    @Test
    public void presenceOfHarry1() {
        assertEquals(true,h1.presenceOfHarry("Harry is Happy"));
    }

    @Test
    public void presenceOfHarry2() {
        assertEquals(true,h1.presenceOfHarry("She is fan of Harry Potter"));
    }

    @Test
    public void presenceOfHarry3() {
        assertEquals(false,h1.presenceOfHarry("She is fan of Tom and Jerry"));
    }
}