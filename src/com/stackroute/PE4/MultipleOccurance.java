package com.stackroute.PE4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurance {

    public String multipleOccurance(String s,String regex)
    {
        String regex1=regex;
        Pattern pattern=Pattern.compile(regex1);
        Matcher matcher=pattern.matcher(s);
        StringBuilder s1=new StringBuilder();
        while(matcher.find())
        {   s1.append("Found at: "+matcher.start()+"-"+matcher.end()+" ");
            System.out.println("Found at:"+matcher.start()+"-"+matcher.end());
        }
        return s1.toString();
    }

    public static void main(String[] args)
    {
        MultipleOccurance m1=new MultipleOccurance();
        String result=m1.multipleOccurance("He saw henry wearing helmet with helper and saying hello","he" );
        System.out.println(result);
    }
}
