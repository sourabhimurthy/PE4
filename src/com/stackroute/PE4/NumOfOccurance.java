package com.stackroute.PE4;
public class NumOfOccurance {

    public int countOccurenceOfAChar (String input, char ch, int index, int count) {
        if (index < input.length()) {
        if (ch == input.charAt(index)) {
            count++;
        }
        index++;
        count = countOccurenceOfAChar(input, ch, index, count);
    }
        return count;
    }
}
