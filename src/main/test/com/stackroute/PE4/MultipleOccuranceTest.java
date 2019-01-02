package com.stackroute.PE4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccuranceTest {
    MultipleOccurance m1;

    @Before
    public void setUp() throws Exception {
        m1=new MultipleOccurance();
    }

    @After
    public void tearDown() throws Exception {
        m1=null;
    }

    @Test
    public void multipleOccurance() {
        assertEquals("Found at: 4-6 Found at: 10-12 Found at: 27-29 ",m1.multipleOccurance("She sells seashells by the seashore","se"));
    }

    @Test
    public void multipleOccurance1() {
        assertEquals("Found at: 7-9 Found at: 21-23 Found at: 33-35 Found at: 51-53 ",m1.multipleOccurance("He saw henry wearing helmet with helper and saying hello","he"));
    }
}