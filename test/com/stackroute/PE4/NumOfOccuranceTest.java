package com.stackroute.PE4;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


    public class NumOfOccuranceTest {
        private  NumOfOccurance countOccurenceOfAChar = new NumOfOccurance();
        @Test
        public void checkSuccess () {
            String string = "Java is java again java again";
            int count = 10; // Count of char 'a'
            assertEquals(count,countOccurenceOfAChar.countOccurenceOfAChar(string,'a',0,0));
        }
        @Test
        public void checkFailure () {
            String string = "Java is java again java again";
            int count = 11; // Count of char 'a'
            assertNotSame(count,countOccurenceOfAChar.countOccurenceOfAChar(string,'a',0,0));
        }
        @Test
        public void checkNotNull () {
            String string = "Java is java again java again";
            int count = 10; // Count of char 'a'
            assertNotNull(countOccurenceOfAChar.countOccurenceOfAChar(string,'a',0,0));
        }
    }

