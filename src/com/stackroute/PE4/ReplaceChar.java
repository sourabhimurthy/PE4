package com.stackroute.PE4;
public class ReplaceChar {

    public String replaceChar(String s)
    {
        String res;
        res=s.replaceAll("l","t");
        res=res.replaceAll("d","f");
        return res;
    }

    public static void main(String[] args)
    {
        ReplaceChar r1=new ReplaceChar();
        String result=r1.replaceChar("daily dry");
        System.out.println(result);
    }
}
