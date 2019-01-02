package com.stackroute.PE4;

public class TransposeWords {

    public String transposeWords(String s)
    {
        String[] sub=s.split("\\s+");
        StringBuilder sub1=new StringBuilder();
        for(int i=0;i<sub.length;i++) {
            for (int j = (sub[i].length()-1); j >= 0; j--) {
                sub1.append(sub[i].charAt(j));
                //System.out.println(sub1);
            }
           sub1.append(" ");
        }
        return sub1.toString().trim();
    }

    public static void main(String[] args)
    {
        TransposeWords t1=new TransposeWords();
        String result=t1.transposeWords("a quick brown");
        System.out.println(result);
    }
}
