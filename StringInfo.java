package com.example.myapplication.Day1Assignment;
import java.util.Scanner;
public class StringInfo {
    String str;
    StringInfo(String s)
    {
        this.str=s;
        System.out.println("Length is"+ str.length());
        System.out.println("UpperCase is"+ str.toUpperCase());
        System.out.println("LowerCase is"+ str.toLowerCase());

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' ||ch=='I' ||ch=='O' || ch=='U')
            {
                count++;
            }

        }
        System.out.println("number of vowel is" +count);
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }

        System.out.println("Reverse of this string is" +sb);





    }

    public static void main(String[] args)
    {
        System.out.println("Input a string");
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();

        StringInfo obj=new StringInfo(val);

    }

}
