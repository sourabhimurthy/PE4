package com.stackroute.PE4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HarryString {

    public boolean presenceOfHarry(String s)
    {
        boolean flag=false;
        Pattern p = Pattern.compile("(.*?)Harry(.*?)");   // the pattern to search for
        Matcher m = p.matcher(s);
        flag=m.lookingAt();
        System.out.println(m.lookingAt());

        return flag;
    }

    public static void main (String[] args)
    {
        HarryString h1=new HarryString();
        String s="This is Harry";
        boolean b1=h1.presenceOfHarry(s);
        System.out.println(b1);
    }
}
