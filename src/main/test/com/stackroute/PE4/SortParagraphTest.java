package com.stackroute.PE4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortParagraphTest {
    SortParagraph s1;

    @Before
    public void setUp() throws Exception {
        s1=new SortParagraph();
    }

    @After
    public void tearDown() throws Exception {
        s1=null;
    }

    @Test
    public void sortPara()
    {
        assertEquals("arrange balcony car driver ",s1.sortPara("driver balcony car arrange"));
    }

    @Test
    public void sortPara1()
    {
        assertEquals("best honesty is policy the ",s1.sortPara("honesty is the best policy"));
    }

    @Test
    public void sortPara2()
    {
        assertEquals("caller calling car char ",s1.sortPara("char calling car caller"));
    }
}