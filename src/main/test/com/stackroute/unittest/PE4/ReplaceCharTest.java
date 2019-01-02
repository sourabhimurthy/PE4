package com.stackroute.PE4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {
    ReplaceChar r1;

    @Before
    public void setUp() throws Exception {
        r1=new ReplaceChar();
    }

    @Test
    public void replaceChar()
    {
        assertEquals("faity fry",r1.replaceChar("daily dry"));
    }

    @Test
    public void replaceChar2()
    {
        assertEquals("faity fry",r1.replaceChar("daily dry"));
    }

    @Test
    public void replaceChar1()
    {
        assertEquals("hetto wortf",r1.replaceChar("hello world"));
    }
}