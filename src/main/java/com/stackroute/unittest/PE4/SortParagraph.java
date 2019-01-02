package com.stackroute.PE4;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortParagraph {

    public String sortPara(String s)
    {
        //char[] array=s.toCharArray();
        String[] array=s.split(" ");
         Arrays.sort(array);
         String res="";
         for(String t:array)
         {
             res+=t+" ";
         }
         return res;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        SortParagraph p1=new SortParagraph();
        String result=p1.sortPara(inp);
        System.out.println(result);


    }

}
