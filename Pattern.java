package com.example.myapplication.Day1Assignment;
import java.util.Scanner;
class Pattern {

    void createpattern(int rows)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Pattern obj=new Pattern();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num of rows");
        int rows=sc.nextInt();
        obj.createpattern(rows);

    }
}
