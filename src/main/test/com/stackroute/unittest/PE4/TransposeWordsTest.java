package com.stackroute.PE4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeWordsTest {
    TransposeWords t1;

    @Before
    public void setUp() throws Exception {
        t1=new TransposeWords();
    }

    @After
    public void tearDown() throws Exception {
        t1=null;
    }

    @Test
    public void transposeWords() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",t1.transposeWords("a quick brown fox jumps over the lazy dog"));

    }

    @Test
    public void transposeWords1() {
        assertEquals("ehT naidnI noitutitsnoC",t1.transposeWords("The Indian Constitution"));

    }

    @Test
    public void transposeWords2() {
        assertEquals("dooG gninroM 321",t1.transposeWords("Good Morning 123"));


    }
}